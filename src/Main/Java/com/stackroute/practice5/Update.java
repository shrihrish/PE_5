/*
1. Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []
 */
package com.stackroute.practice5;

import java.util.ArrayList;
import java.lang.String;

public class Update {
    public String updateArray() {
        ArrayList<String> list = new ArrayList();

        list.add("Appple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        list.set( 0 , "Kiwi");
        list.set( 2 , "Mango");
       String str = list.toString();

        return str;
    }
}
