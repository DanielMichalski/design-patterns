package singleton.kwiaciarnia_pj.kwiaty;

import singleton.kwiaciarnia_pj.PriceList;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public abstract class Flower {
    private int howManyFlowers;
    private String color;
    private String name;
    private PriceList priceList;

    public Flower(int howManyFlowers, String name, String color) {
        this.howManyFlowers = howManyFlowers;
        this.name = name;
        this.color = color;
        priceList = PriceList.getInstance();
    }

    public String getColor() {
        return color;
    }

    public int getHowManyFlowers() {
        return howManyFlowers;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        Integer price = getPriceList().get(getName());
        if (price == null) price = -1;

        return getName() + ", kolor: " + getColor() +
                ", ilość " + getHowManyFlowers() +
                ", cena " + price;
    }
}
