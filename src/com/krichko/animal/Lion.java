package com.krichko.animal;

import com.krichko.meal.Meat;


public class Lion implements IAnimal<Meat> {


    @Override
    public void eat(Meat meal) {
        if (meal != null){
            System.out.println("Lion eat " + meal.getType());
        }
    }


}
