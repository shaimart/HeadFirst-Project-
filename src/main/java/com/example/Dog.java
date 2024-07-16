package com.example;

public class Dog {
    //incapsulation - using private for variable
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public static void main(String[] args) {


        Dog mydog = new Dog();
//        mydog.bark();
        mydog.name = "Puppy";

        // creating array of links to object type Dog
        Dog[] manyDogs = new Dog[3];
        manyDogs[0] = new Dog();
        manyDogs[1] = new Dog();
        manyDogs[2] = mydog;

        // Setting names
//        manyDogs[0].name = "Fuffy";
//        manyDogs[1].name = "Duddy";

        // Using setters for set Name
        manyDogs[0].setName("Fuffy");
        manyDogs[1].setName("Duddy");


        // Setting size
//        manyDogs[0].size = 12;
//        manyDogs[1].size = 35;
//        manyDogs[2].size = 65;

        // Using setters for set size
        manyDogs[0].setSize(12);
        manyDogs[1].setSize(35);
        manyDogs[2].setSize(65);

        System.out.println("Name of third Dog in our array is " + manyDogs[2].name + ". ");

        int i = 0;
        while (i < manyDogs.length) {
//            manyDogs[i].bark();
            manyDogs[i].barkbysize();
           // System.out.println("It's my name " + manyDogs[i].name + ". My size is " + manyDogs[i].size);
            i++;
        }

        // Sum of 2 using getters
        int w;
        w = manyDogs[0].getSize() + manyDogs[1].getSize(); // it gonna be 12 + 35
        System.out.println(w); // 47


    }
    public void bark() {
        System.out.println("Vuf-Vuf " + name + " said." ); }

    void barkbysize() {
        if (size > 60) {

            System.out.println("Vuuuuf " + name + " said.");
        } else if (size > 30) {
            System.out.println("Guf-Guf " + name + " said.");
        } else if (size > 10) {
            System.out.println("Tjaf-Tjaf " + name + " said.");
        }
    }

}
