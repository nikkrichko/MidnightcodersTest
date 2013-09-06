package com.krichko.animal;

import com.krichko.meal.Grass;
import com.krichko.meal.IMeal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: b0noI
 * Date: 06.09.13
 * Time: 08:30
 * To change this template use File | Settings | File Templates.
 */
public class CowTest {
    @Test
    public void testGetType() throws Exception {
        IMeal testClass = new Cow();
        assertEquals("Cow", testClass.getType());
    }

    @Test
    public void testEatIvGrass() throws Exception {
        Grass inputValue = new Grass();
        IAnimal<Grass> testClass = new Cow();

        testClass.eat(inputValue);

    }

    @Test
    public void testEatIvNull() throws Exception {
        Grass inputValue = null;
        IAnimal<Grass> testClass = new Cow();

        testClass.eat(inputValue);

    }
}
