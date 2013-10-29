package wzorce_zlozone.kaczki;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class GesAdapter implements Kwaczaca {
    private Ges ges;

    public GesAdapter(Ges ges) {
        this.ges = ges;
    }

    @Override
    public void kwacz() {
        ges.gegaj();
    }
}
