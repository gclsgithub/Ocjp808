package com.study;

public class Demo22 {
    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Base2();
        Base b3 = new DrivernA();

        b1 = (Base)b3;

        Base b4 = (DrivernA)b3;

        b1.test();

        b4.test();
    }
}

class Base {
    public void test(){
        System.out.println("BASE1");
    }
}

class Base2  extends  Base{
    @Override
    public void test(){
        System.out.println("Base2");
    }
}

class DrivernA extends  Base2 {
    @Override
    public void test(){
        System.out.println("DrivernA");
    }
}