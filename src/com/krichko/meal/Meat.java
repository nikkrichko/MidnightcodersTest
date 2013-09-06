package com.krichko.meal;

public class Meat implements IMeal {


    @Override
    public String getType() {
        return Meat.class.getSimpleName();
    }


}
