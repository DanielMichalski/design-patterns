package obserwator.obserwator2;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class Main {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezaceWyswietl wbw = new WarunkiBiezaceWyswietl(danePogodowe);

        danePogodowe.ustawOdczyty(22.3f, 60.0f, 1001f);
        danePogodowe.ustawOdczyty(25.5f, 40.0f, 1010f);
    }
}
