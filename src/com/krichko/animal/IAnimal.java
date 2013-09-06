package com.krichko.animal;


import com.krichko.meal.IMeal;

public interface IAnimal<T extends IMeal> {


    public void eat(T meal);


}
