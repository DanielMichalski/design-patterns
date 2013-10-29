package fabryka.fabryka_head;

import fabryka.fabryka_head.pizze.Pizza;
import fabryka.fabryka_head.pizzeria.AmerykanskaPizzeria;
import fabryka.fabryka_head.pizzeria.Pizzeria;
import fabryka.fabryka_head.pizzeria.WloskaPizzeria;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class Main {
    public static void main(String[] args) {
        Pizzeria wloska = new WloskaPizzeria();
        Pizzeria amerykanska = new AmerykanskaPizzeria();

        Pizza pizza = wloska.zamowPizze("serowa");
        System.out.println("Eryk zamówił: " + pizza.getNazwa());

        pizza = amerykanska.zamowPizze("serowa");
        System.out.println("Jacek zamówił: " + pizza.getNazwa());

    }
}
