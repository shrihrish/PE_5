/*
4. Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.
 */
package com.stackroute.practice5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTest
{
    public ArrayList<Student> driving(ArrayList<Student> arrayList)
    {
        StudentSorter studentSorter=new StudentSorter();
        Collections.sort(arrayList,studentSorter);
        return arrayList;
    }
}

 class Student {
     private int age, id;
     private String name;

     public Student(int age, String name, int id) {
         this.age = age;
         this.name = name;
         this.id = id;

     }

     public String toString() {
         return "Student{" +
                 "id=" + id +
                 ", name=" + name + '\'' +
                 ", age =" + age +
                 '}';
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

    class StudentSorter implements Comparator<Student> {

        @Override
        public int compare(Student student,Student t1) {
            if(student.getAge() ==t1.getAge())
            {
                if (student.getName().compareTo(t1.getName())==0)
                {
                    if (student.getId()>t1.getId())
                    {
                        return 1;
                    }
                    else
                    {
                        return -1;
                    }
                }
                else if (student.getName().compareTo(t1.getName())>1)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
            else if(student.getAge() >t1.getAge())
            {
                return 1;
            }
            else
            {
                return -1;
            }

        }

    }


