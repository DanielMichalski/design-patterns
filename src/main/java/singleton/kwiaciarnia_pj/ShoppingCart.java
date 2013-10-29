package singleton.kwiaciarnia_pj;

import singleton.kwiaciarnia_pj.kwiaty.Flower;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author: Daniel
 * Date: 05.08.13
 */

public class ShoppingCart {
    private Map<Flower, Integer> kwiaty;
    private Customer owner;
    private PriceList priceList = PriceList.getInstance();

    public ShoppingCart(Customer owner) {
        kwiaty = new HashMap<Flower, Integer>();
        this.owner = owner;
    }

    public void addFlower(Flower flower) {
        kwiaty.put(flower, priceList.get(flower.getName()));
    }

    public void usunKwiatyKtorychNieZnamyCeny() {
        Iterator<Map.Entry<Flower, Integer>> iterator = kwiaty.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() == null)
                iterator.remove();
        }
    }

    public int obliczCeneZakupow() {
        int price = 0;
        for (Flower flower : kwiaty.keySet()) {
            for (int i = 0; i < flower.getHowManyFlowers(); i++) {
                if (price + kwiaty.get(flower) > owner.getCash())
                    break;
                else
                    price += kwiaty.get(flower);
            }
        }
        return price;
    }

    @Override
    public String toString() {
        if (kwiaty.size() == 0)
            return "Wózek właściciel " + owner.getImie() + " -- pusto";
        else {
            StringBuilder builder = new StringBuilder();
            builder.append("Wozek właściciel " + owner.getImie() + "\n");
            for (Flower flower : kwiaty.keySet()) {
                builder.append(flower + "\n");
            }
            return builder.toString();
        }

    }

    public Map<Flower, Integer> getKwiaty() {
        return kwiaty;
    }

    public void setKwiaty(Map<Flower, Integer> kwiaty) {
        this.kwiaty = kwiaty;
    }
}
