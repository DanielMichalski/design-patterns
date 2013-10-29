package obserwator.obserwator1;

/**
 * Author: Daniel
 * Date: 03.08.13
 */

public class Main {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl =
                new WarunkiBiezaceWyswietl(danePogodowe);

        danePogodowe.ustawOdczyty(26.6f, 65f, 1013.1f);
    }
}
