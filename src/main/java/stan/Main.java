package stan;

import stan.stany.Automat;

import java.awt.*;
import java.util.Random;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class Main {
    public static void main(String[] args) {
        Automat automat = new Automat(5);

        System.out.println(automat);

        automat.wrzucMonete();
        automat.przekrecGalke();

        System.out.println(automat);

        automat.wrzucMonete();
        automat.przekrecGalke();
        automat.wrzucMonete();
        automat.przekrecGalke();

        System.out.println(automat);
    }
}
