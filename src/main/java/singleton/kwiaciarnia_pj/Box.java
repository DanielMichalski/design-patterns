package singleton.kwiaciarnia_pj;

import singleton.kwiaciarnia_pj.kwiaty.Flower;

import java.util.Map;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class Box {
    private Map<Flower, Integer> kwiaty;
    private Customer customer;

    public Box(Customer customer) {
        this.customer = customer;
        kwiaty = customer.getShoppingCart().getKwiaty();
    }

    public void setKwiaty(Map<Flower, Integer> kwiaty) {
        this.kwiaty = kwiaty;
    }

    @Override
    public String toString() {
        if (kwiaty.size() == 0)
            return "Wózek właściciel " + customer.getImie() + " -- pusto";
        else {
            StringBuilder builder = new StringBuilder();
            builder.append("Wozek właściciel " + customer.getImie() + "\n");
            for (Flower flower : kwiaty.keySet()) {
                builder.append(flower + "\n");
            }
            return builder.toString();
        }

    }
}
