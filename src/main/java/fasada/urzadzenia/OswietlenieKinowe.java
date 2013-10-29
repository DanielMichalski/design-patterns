package fasada.urzadzenia;

/**
 * Author: Daniel
 * Date: 09.08.13
 */

public class OswietlenieKinowe {
    private int wartoscOwietleniea;

    public OswietlenieKinowe() {
        this.wartoscOwietleniea = 20;
    }

    public void sciemniaj(int i) {
        this.wartoscOwietleniea -= i;
    }

    public void wlacz() {
        System.out.println("Oswietlenie sufitowe kina: włączone 100%");
    }
}
