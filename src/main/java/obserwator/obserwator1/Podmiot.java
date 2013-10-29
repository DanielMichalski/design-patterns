package obserwator.obserwator1;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public interface Podmiot {
    public void zarejestrujObserwatora(Obserwator o);

    public void usunObserwatora(Obserwator o);

    public void powiadomObserwatorow();
}
