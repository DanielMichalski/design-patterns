package flyweight;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class BoxTest {
    public static void main(String[] args) {
        BoxDimensionFactory boxDimFac = BoxDimensionFactory.getInstance();

        int[] potrzebne = {10, 10, 10, 20, 30, 45, 20, 20, 20, 10,
                20, 50, 65, 50, 50, 60, 100, 50, 50, 50};
        Box box = null;
        for (int i = 0; i < potrzebne.length; i++)
            box = new Box(boxDimFac.makeDimension(potrzebne[i]), "Kwiaty");

        System.out.println("Ostatnie pudełko");
        System.out.println(box);

        System.out.println("Na " + potrzebne.length + " rozmiarów pudełek\n" +
                "Utworzono nowych " + (potrzebne.length - boxDimFac.getReusedCount()) + "\n" +
                "Ponownie użyto (przy współdzieleniu) " + boxDimFac.getReusedCount());
    }
}
