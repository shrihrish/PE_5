package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public  class CountstringTest {
    Countstring countstr;

    @Before
    public void setUp() throws Exception {
        countstr=new Countstring();
    }

    @After
    public void tearDown() throws Exception {
        countstr=null;
    }

    @Test
    public void countstring() {
        String expected="{one=5, two=2, three=2}";
        String actual=countstr.countstring("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }

    @Test
    public void countstringNull() {

        String actual=countstr.countstring(null);
        assertNull(actual);
    }

    @Test
    public void countstringNotNull() {

        String actual=countstr.countstring("i am Batman");
        assertNotNull(actual);
    }
}
