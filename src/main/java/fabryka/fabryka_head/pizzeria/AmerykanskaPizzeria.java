package fabryka.fabryka_head.pizzeria;

import fabryka.fabryka_head.pizze.AmerykanskaSerowaPizza;
import fabryka.fabryka_head.pizze.Pizza;

/**
 * Author: Daniel
 * Date: 04.08.13
 */

public class AmerykanskaPizzeria extends Pizzeria {
    @Override
    protected Pizza utworzPizza(String type) {
        return new AmerykanskaSerowaPizza();
    }
}
