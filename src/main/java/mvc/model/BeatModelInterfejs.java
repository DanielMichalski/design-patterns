package mvc.model;

/**
 * Author: Daniel
 * Date: 15.08.13
 */

public interface BeatModelInterfejs {
    void inicjuj();

    void start();

    void stop();

    void ustawBMP(int bmp);

    int getBMP();

    void zarejestrujObserwatora(ObserwatorUderzen o);

    void wyrejestrujObserwatora(ObserwatorUderzen o);

    void zarejestrujObserwatora(ObserwatorBMP o);

    void wyrejestruObserwatora(ObserwatorBMP o);
}
