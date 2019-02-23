package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MappingTest {
    Mapping map;

    @Before
    public void setUp() throws Exception {
    map = new Mapping();

    }

    @After
    public void tearDown() throws Exception {
    map = null;

    }

    @Test
    public void mapping() {
        Map<String,String> inputMap=new HashMap<String, String>();
        inputMap.put("val1","Java");
        inputMap.put("val2","C++");
        Map<String,String> outputMap=new HashMap<String, String>();
        outputMap.put("val1"," ");
        outputMap.put("val2","Java");
        assertEquals(outputMap,map.mapping(inputMap));
    }
@Test

    public void mapingPart2() {
    Map<String,String> inputMap=new HashMap<String, String>();
    inputMap.put("val1","mars");
    inputMap.put("val2","Saturn");
    Map<String,String> outputMap=new HashMap<String, String>();
    outputMap.put("val1"," ");
    outputMap.put("val2","mars");
    assertEquals(outputMap,map.mapping(inputMap));
}
}