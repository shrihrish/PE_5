/*6. Write a program to implement set interface which sorts the given randomly ordered names in

ascending order. Convert the sorted set in to an array list
*/


package com.stackroute.practice5;
import java.util.ArrayList;
import java.util.TreeSet;

public class Ascendingorder {
public ArrayList<String> ascendingorder (TreeSet<String> treeSet)
{
    ArrayList<String> arrayList= new ArrayList<String>();
    for (String str : treeSet)

    {
        arrayList.add(str);
    }
    return arrayList;
}
}
