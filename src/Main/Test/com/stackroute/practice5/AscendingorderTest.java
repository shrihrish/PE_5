
package com.stackroute.practice5;

import com.stackroute.practice5.Ascendingorder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class AscendingorderTest {
    Ascendingorder sort;


    @Before
    public void setUp() throws Exception {
    sort = new Ascendingorder();
    }

    @After
    public void tearDown() throws Exception {
    sort = null;
    }

    @Test
    public void ascendingorder() {
        TreeSet<String>inputTreeSet= new TreeSet<>();
        Collections.addAll(inputTreeSet,"Harry","Olive","Alice","Bluto","Eugene");
        ArrayList<String> inputArrayList = new ArrayList<String>();
        Collections.addAll(inputArrayList,"Alice","Bluto","Eugene","Harry","Olive");
        assertEquals(inputArrayList,sort.ascendingorder(inputTreeSet));
    }
    @Test
    public void ascendingorderfail()
    {
        TreeSet<String>inputTreeSet=new TreeSet<>();
        Collections.addAll(inputTreeSet,"Harry","Olive","Alice","Bluto","Eugene");
        ArrayList<String> inputArrayList=new ArrayList<>();
        Collections.addAll(inputArrayList,"Harry","Olive","Alice","Bluto","Eugene");
        assertNotEquals(inputArrayList,sort.ascendingorder(inputTreeSet));
    }


}
