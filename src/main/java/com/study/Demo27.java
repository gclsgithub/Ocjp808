package com.study;

public class Demo27 {
    public static void main(String[] args) {

    }
}
class Vehicle1 {
    int x;
    Vehicle1(){
        this(10);
    }
    Vehicle1(int x) {
        this.x = x;
    }
}

class Car2 extends  Vehicle1 {
    int y ;
    Car2 (){
        super();
       // this(20);
    }
    Car2 (int y ) {
        this.y  = y;
    }

    @Override
    public String toString(){
        return  super.x + ":" +this.y;
    }
}
