package com.study;

import sun.rmi.transport.Transport;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo02 {

    public static void main(String[] args) {

//        //抽象类的方法
//        ArrayList<A> alist = new ArrayList<>();
//        alist.add(new B());
//
//        //接口的方法
//        ArrayList<C> blist = new ArrayList<>();
//        blist.add(new D());

        //共同父类
        ArrayList<Vehicle> clist = new ArrayList<>();
        //clist.add(new Motorcycle());
    }
}


class Transportation {

}

class Vehicle extends Transportation {

}
class Motorcycle extends Transportation {

}
abstract class A {

}
class B  extends A{

}

interface  C {

}
class  D implements C {
}
