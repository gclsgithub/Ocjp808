package com.study;

import java.util.ArrayList;

/**
 *  无法捕捉的异常，这个异常是由JVM抛出的
 */
public class Demo23 {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        String[] myArray;
        try {
            while (true){
                mylist.add("My String ");
            }
        }catch (RuntimeException re){
            System.out.println("cauthch a runtime exception");
        }catch (Exception e){
            System.out.println("catch a exception");
        }
        System.out.println("ready to use");
    }
}
