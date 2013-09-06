package com.krichko.meal;


public class Grass implements IMeal {


    @Override
    public String getType() {
        return Grass.class.getSimpleName();
    }


}
