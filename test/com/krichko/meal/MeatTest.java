package com.krichko.meal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MeatTest {

    @Test
    public void testGetType() throws Exception {

        IMeal testClass = new Meat();

        assertEquals("Meat", testClass.getType());
    }


}
