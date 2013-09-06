package com.krichko.meal;

import org.junit.Test;
import static org.junit.Assert.*;


public class GrassTest {
    @Test
    public void testGetType() throws Exception {
           IMeal testClass = new Grass();

            assertEquals("Grass", testClass.getType());

    }
}
