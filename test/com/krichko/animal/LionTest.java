package com.krichko.animal;

import com.krichko.meal.IMeal;
import com.krichko.meal.Meat;
import org.junit.Test;

/*
    This test can't test return values (we can't use assert). This test ONLY tests that method don't crushed while running
 */
public class LionTest {
    @Test
    public void testEatIvCOW() throws Exception {
        Meat inputValue = new Cow();
        IAnimal<Meat> testClass = new Lion();

        testClass.eat(inputValue);
    }

    @Test
    public void testEatIvGoat() throws Exception {
        Meat inputValue = new Goat();
        IAnimal<Meat> testClass = new Lion();

        testClass.eat(inputValue);
    }

    @Test
    public void testEatIvMeat() throws Exception {
        Meat inputValue = new Meat();
        IAnimal<Meat> testClass = new Lion();

        testClass.eat(inputValue);
    }

    @Test
    public void testEatIvNull() throws Exception {
        Meat inputValue = null;
        IAnimal<Meat> testClass = new Lion();

        testClass.eat(inputValue);
    }
}
