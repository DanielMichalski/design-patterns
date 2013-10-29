package flyweight;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public class BoxDimensionFactory {
    private int[] widths = {10, 20, 30, 40, 50, 60, 70};

    private Dimension[] d = new Dimension[widths.length];

    private int reused;

    private static BoxDimensionFactory bdf;

    private BoxDimensionFactory() {
    }

    public static BoxDimensionFactory getInstance() {
        if (bdf == null)
            bdf = new BoxDimensionFactory();
        return bdf;
    }

    public Dimension makeDimension(int w) {
        for (int i = 0; i < widths.length; i++) {
            if (w == widths[i]) {
                if (d[i] == null)
                    d[i] = new Dimension(2, 2 * w);
                else
                    reused++;
                return new Dimension(w, 2 * w);
            }
        }
        return new Dimension(w, 2 * w);
    }

    public int getReusedCount() {
        return reused;
    }
}
