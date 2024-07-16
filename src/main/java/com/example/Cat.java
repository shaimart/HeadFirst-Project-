package com.example;

public class Cat {
    private String Name;
    private int size;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Cat my_cat = new Cat();

        my_cat.Name = "Alisa";

        Cat[] setOfCats = new Cat[3];
        setOfCats[0] = new Cat();
        setOfCats[1] = new Cat();
        setOfCats[2] = my_cat;

        setOfCats[0].setName("Frency");
        setOfCats[1].setName("Billy");

        setOfCats[0].setSize(10);
        setOfCats[1].setSize(13);
        setOfCats[2].setSize(5);

        for (Cat s : setOfCats ) {
            System.out.println(s.Name);
            System.out.println(s.size);
            s.meowBySize();
            System.out.println("____________________");
        }
//        System.out.println("____________________");

//        int i = 0;
//        while (i < setOfCats.length) {
//            setOfCats[i].meowBySize();
//            i++;
//        }
    }


    public void meowBySize() {
        if (size > 10) {
            System.out.println("MEEEEOWWW " + Name + " says!!!");
        } else if (size > 5) {
            System.out.println("Meeoww " + Name + " says!");
        }
        else {
            System.out.println("Meow " + Name + " says...");
        }
    }

 }
