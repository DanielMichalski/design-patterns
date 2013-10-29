package obserwator.obserwator1;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public class WarunkiBiezaceWyswietl implements Obserwator, WyswietlElement {
    private float temperatura;
    private float wilgotnosc;
    private Podmiot danePogodowe;

    public WarunkiBiezaceWyswietl(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temperatura = temp;
        this.wilgotnosc = wilgotnosc;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki bieżące " + temperatura +
                " stopni C oraz " + wilgotnosc + "% wilgotnosci");
    }
}
