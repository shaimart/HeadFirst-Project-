package com.example;

import java.util.ArrayList;

public class ArrayListVersusSimpleArray {
    public static void main(String[] args) {
        ////   ArrayList    ////

        // Creating ArrayList that presents List of objects type Dog
        // we dont have to write the size of our ArrayList
        ArrayList<Dog> list = new ArrayList<>();

        // Creating new objects type Dog ang setting names them
        Dog a = new Dog();
        a.setName("DogA");
        Dog b = new Dog();
        b.setName("DogB");
        Dog c = new Dog();
        c.setName("DogC");

        // Adding objects a,b,c at our ArrayList
        list.add(a);
        list.add(b);
        list.add(c);

        // How many elements in our ArrayList
        int theSize = list.size();
        System.out.println(theSize);
        System.out.println("--------------");// prints 3

        // Getting element by index
        Object o = list.get(1);
        System.out.println(o); // com.example.Dog@5f184fc6 ?????????

        // Does ArrayList contain element a/b/c
        boolean isInA = list.contains(a);
        boolean isInB = list.contains(b);
        boolean isInC = list.contains(c);

        System.out.println(isInA); // if contains - true
        System.out.println(isInB); // true
        System.out.println(isInC); // true

        // What's the index of element a/b/c
        int indexOfA = list.indexOf(a);
        System.out.println(indexOfA); // 0

        // Is the ArrayList empty
        boolean isEmptyArray = list.isEmpty();
        System.out.println(isEmptyArray); // false

        // Removing the element from ArrayList
        // Removing by indexes
//        list.remove(0);
        // Removing by object
//        list.remove(a);

        /////////////////////////////////////

        ////   Simple Array    ////

        // Creating Array that presents List of objects type Dog
        // we HAVE to write the size of our Array
        Dog[] listOfDogs = new Dog[3];

        // Creating new objects type Dog ang setting names them
        Dog d = new Dog();
        d.setName("DogD");
        Dog f = new Dog();
        f.setName("DogF");
        Dog e = new Dog();
        e.setName("DogE");

        // Adding objects d,e,f at our Array
        listOfDogs[0] = d;
        listOfDogs[1] = f;
        listOfDogs[2] = e;

        // How many elements in our ArrayList
        int theSizeArray = listOfDogs.length;
        System.out.println(theSizeArray); // prints 3

        // Getting element by index
        Object p = listOfDogs[1];
        System.out.println(p); // com.example.Dog@3feba861

        // Removing the element from Array !!!!!
        // we cant remove it, bc Array has constant length
        // the only thing that we can do - assign the value "null"
//        listOfDogs[1] = null;

        // Does Array contain element d
        boolean isInD = false;
        for (Dog item : listOfDogs) {
            if (item.equals(d)) {
                isInD = true;
                break;
            }
        }

    }
}
