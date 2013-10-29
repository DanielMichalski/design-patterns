package mvc.controller;

import mvc.model.BeatModelInterfejs;
import mvc.widok.DJWidok;

/**
 * Author: Daniel
 * Date: 16.08.13
 */

public class BeatController implements BeatControllerInterfejs {
    private BeatModelInterfejs model;
    private DJWidok widok;


    public BeatController(BeatModelInterfejs model) {
        this.model = model;
        widok = new DJWidok(model, this);
        widok.utworzWidok();
        widok.utworzElementySterujace();
        widok.dezaktywujStopMenuItem();
        widok.aktywujStartMenuItem();
        model.inicjuj();
    }

    @Override
    public void start() {
        model.start();
        widok.dezaktywujStartMenuItem();
        widok.aktywujStopMenuItem();
    }

    @Override
    public void stop() {
        model.stop();
        widok.dezaktywujStopMenuItem();
        widok.aktywujStartMenuItem();
    }

    @Override
    public void zwiekszBMP() {
        int bmp = model.getBMP();
        model.ustawBMP(bmp+1);
    }

    @Override
    public void zmniejszBMP() {
        int bmp = model.getBMP();
        model.ustawBMP(bmp+1);
    }

    @Override
    public void ustawBMP(int bmp) {
        model.ustawBMP(bmp);
    }
}
