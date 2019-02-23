package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceTest {

    Occurence appearance;
    @Before
    public void setUp() throws Exception {
        appearance=new Occurence();
    }

    @After
    public void tearDown() throws Exception {
        appearance=null;
    }

    @Test
    public void checkAppearance() {
        String expected="{a : true, b : false, c : true, d : false}";
        String arr[] = {"a","b","c","d","a","c","c"};
        String actual=appearance.checkOccurence(String.join(" ",arr)).replaceAll("="," : ");
        assertEquals(expected,actual);
    }

    @Test
    public void checkAppearanceNull() {

        String actual=appearance.checkOccurence(null);
        assertNull(actual);

    }

}
