package flyweight;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class Box {
    private Dimension dim;
    private String cont;

    public Box(Dimension dim, String cont) {
        this.dim = dim;
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Pudełko: " + dim + " Zawartość: " + cont;
    }
}
