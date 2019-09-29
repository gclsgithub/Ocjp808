package com.study;

import java.util.ArrayList;

public class Demo32 {
}

abstract class Animal{

    public static void main(String[] args) {
        ArrayList<Animal> mylist = new ArrayList<>();
        mylist.add(new Cat());

        //D
        ArrayList<Tiger> mylist2 = new ArrayList<>();
       // mylist2.add(new Cat());
    }
}

interface Hunter{

}
class Cat extends Animal implements Hunter{}

class Tiger extends  Cat{

}
