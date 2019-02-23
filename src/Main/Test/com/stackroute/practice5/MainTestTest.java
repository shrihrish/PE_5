package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest mainTest;

    @Before
    public void setUp() throws Exception {
        mainTest=new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        mainTest=null;
    }

    @Test
    public void arrayList() {
        Student s1=new Student(18,"anurag",1000);
        Student s2=new Student(20,"hrishabh",11);
        Student s3=new Student(18,"anurag",118);
        Student s4=new Student(18,"mayank",15);
        Student s5=new Student(16,"ramesh",16);
        ArrayList<Student> arrayList=new ArrayList<>();
        Collections.addAll(arrayList,s1,s2,s3,s4,s5);
        ArrayList<Student> expectedArrayList=new ArrayList<>();
        Collections.addAll(expectedArrayList,s5,s3,s1,s4,s2);
        assertEquals(expectedArrayList,mainTest.driving(arrayList));
    }
}