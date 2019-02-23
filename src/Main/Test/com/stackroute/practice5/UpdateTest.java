package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateTest {
    Update obj;

    @Before
    public void setUp() throws Exception {
        obj = new Update();
    }

    @After
    public void tearDown() throws Exception {
    obj = null;
    }

    @Test
    public void updateArray() {
     String  actualValue = obj.updateArray();
    String expectedValue = ("[Kiwi, Grape, Mango, Berry]");
    assertEquals(expectedValue,actualValue);
    }
}