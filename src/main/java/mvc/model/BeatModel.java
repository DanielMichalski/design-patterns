package mvc.model;

import javax.sound.midi.*;
import java.util.ArrayList;

/**
 * Author: Daniel
 * Date: 15.08.13
 */

public class BeatModel implements BeatModelInterfejs, MetaEventListener {
    private Sequencer sequencer;
    private ArrayList<ObserwatorUderzen> obserwatorzyUderzen
            = new ArrayList<ObserwatorUderzen>();
    private ArrayList<ObserwatorBMP> obserwatorzyBMP =
            new ArrayList<ObserwatorBMP>();
    private int bmp = 90;
    private Sequence sequence;
    private Track track;

    @Override
    public void inicjuj() {
        konfigurujMidi();
        zbudujSciezkeIRozpocznij();
    }

    private void konfigurujMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            sequencer.setTempoInBPM(getBmp());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void zbudujSciezkeIRozpocznij() {
        int[] trackList = { 35, 0, 46, 0 };

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        zbudujSciezki(trackList);
        track.add(zbudujMidiEvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void zbudujSciezki(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            int key = lista[i];

            if (key != 0) {
                track.add(zbudujMidiEvent(144, 9, key, 100, i));
                track.add(zbudujMidiEvent(128, 9, key, 100, i+1));
            }
        }
    }

    private MidiEvent zbudujMidiEvent(int polecenie, int kanal, int dane1, int dane2, int czas) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(polecenie, kanal, dane1, dane2);
            event = new MidiEvent(a, czas);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

    @Override
    public void start() {
        sequencer.start();
        ustawBMP(90);
    }

    @Override
    public void stop() {
        ustawBMP(0);
        sequencer.stop();
    }

    @Override
    public void ustawBMP(int bmp) {
        this.bmp = bmp;
        sequencer.setTempoInBPM(getBmp());
        powiadomObserwatorowBMP();
    }

    @Override
    public int getBMP() {
        return bmp;
    }

    @Override
    public void zarejestrujObserwatora(ObserwatorUderzen o) {
        obserwatorzyUderzen.add(o);
    }

    @Override
    public void wyrejestrujObserwatora(ObserwatorUderzen o) {
        obserwatorzyUderzen.remove(o);
    }

    @Override
    public void zarejestrujObserwatora(ObserwatorBMP o) {
        obserwatorzyBMP.add(o);
    }

    @Override
    public void wyrejestruObserwatora(ObserwatorBMP o) {
        obserwatorzyBMP.remove(o);
    }

    @Override
    public void meta(MetaMessage meta) {
        if (meta.getType() == 47) {
            uderzenieEvent();
            sequencer.start();
            ustawBMP(getBMP());
        }
    }

    public void uderzenieEvent() {
        powiadomObserwatorowUderzen();
    }

    private void powiadomObserwatorowUderzen() {
        for (ObserwatorUderzen obserwatorUderzen : obserwatorzyUderzen) {
            obserwatorUderzen.aktualizujBeat();
        }
    }

    private void powiadomObserwatorowBMP() {
        for (ObserwatorBMP obserwatorBMP : obserwatorzyBMP) {
            obserwatorBMP.aktualizujBeat();
        }
    }

    public int getBmp() {
        return bmp;
    }
}
