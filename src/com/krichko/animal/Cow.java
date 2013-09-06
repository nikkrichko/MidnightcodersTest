package com.krichko.animal;


import com.krichko.meal.Grass;
import com.krichko.meal.Meat;

public class Cow extends Meat implements IAnimal<Grass> {


    @Override
    public String getType() {
        return Cow.class.getSimpleName();
    }


    @Override
    public void eat(Grass meal) {
        if (meal != null)
            System.out.println("I am " + getType() + ". I eat " + meal.getType());
    }


}
