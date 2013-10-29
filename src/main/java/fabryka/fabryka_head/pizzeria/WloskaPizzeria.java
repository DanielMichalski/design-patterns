package fabryka.fabryka_head.pizzeria;

import fabryka.fabryka_head.pizze.Pizza;
import fabryka.fabryka_head.pizze.WłoskaSerowaPizza;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class WloskaPizzeria extends Pizzeria {
    @Override
    protected Pizza utworzPizza(String type) {
        return new WłoskaSerowaPizza();
    }
}
