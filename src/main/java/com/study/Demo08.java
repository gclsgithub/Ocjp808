package com.study;

public class Demo08 {

    public static void main(String[] args) {
        String ta  = "A ";
        //A B
        ta = ta.concat("B ");

        String tb =  "C ";
        ta = ta.concat(tb);

        //A B C

        //A B D
        String relace = ta.replace('C','D');
        //A B D C
        ta = ta.concat(tb);
        System.out.println(ta);
        System.out.println(relace);
    }
}
