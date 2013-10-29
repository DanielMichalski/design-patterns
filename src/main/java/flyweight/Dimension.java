package flyweight;

/**
 * Author: Daniel
 * Date: 07.08.13
 */

public final class Dimension {
    private int width;
    private int height;

    public Dimension(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return width + "x" + height;
    }
}
