package fabryka.fabryka_head.pizzeria;

import fabryka.fabryka_head.pizze.Pizza;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public abstract class Pizzeria {
    public Pizza zamowPizze(String type) {
        Pizza pizza;

        pizza = utworzPizza(type);

        pizza.przygotowywanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();
        return pizza;
    }

    protected abstract Pizza utworzPizza(String type);
}
