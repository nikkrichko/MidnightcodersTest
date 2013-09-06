package com.krichko.animal;

import com.krichko.meal.Grass;
import com.krichko.meal.IMeal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: b0noI
 * Date: 06.09.13
 * Time: 08:19
 * To change this template use File | Settings | File Templates.
 */
public class GoatTest {
    @Test
    public void testGetType() throws Exception {
        IMeal testClass = new Goat();
        assertEquals("Goat", testClass.getType());
    }

    @Test
    public void testEatIvGrass() throws Exception {
        Grass inputValue = new Grass();
        IAnimal<Grass> testClass = new Goat();

        testClass.eat(inputValue);

    }

    @Test
    public void testEatIvNull() throws Exception {
        Grass inputValue = null;
        IAnimal<Grass> testClass = new Goat();

        testClass.eat(inputValue);

    }

}
