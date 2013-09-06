package com.krichko;

import com.krichko.animal.Cow;
import com.krichko.animal.Goat;
import com.krichko.animal.Lion;
import com.krichko.meal.Grass;

public class Main {

    public static void main(String[] args) {
        // TODO

        Lion lowe = new Lion();
        Cow moooo = new Cow();
        Goat beee = new Goat();
        Grass polova = new Grass();


        lowe.eat(moooo);
        lowe.eat(beee);
        System.out.println();
        moooo.eat(polova);
        beee.eat(polova);


    }

}
