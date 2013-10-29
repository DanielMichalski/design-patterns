package singleton.kwiaciarnia_pj;

import singleton.kwiaciarnia_pj.kwiaty.Flower;

import java.util.HashMap;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class Customer {
    private ShoppingCart shoppingCart;
    private String imie;
    private int money;

    public Customer(String imie, int money) {
        shoppingCart = new ShoppingCart(this);
        this.imie = imie;
        this.money = money;
    }

    public void get(Flower flower) {
        shoppingCart.addFlower(flower);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public String getImie() {
        return imie;
    }

    public void pay() {
        shoppingCart.usunKwiatyKtorychNieZnamyCeny();
        money -= shoppingCart.obliczCeneZakupow();
    }

    public int getCash() {
        return money;
    }

    public void pack(Box pudelkoJanka) {
        pudelkoJanka.setKwiaty(shoppingCart.getKwiaty());
        shoppingCart.setKwiaty(new HashMap<Flower, Integer>());
    }
}
