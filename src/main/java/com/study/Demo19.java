package com.study;

public class Demo19 {
    public static void main(String[] args) {
        Demo19 demo19 = new Demo19();

        System.out.println(flag);

        flag = doRevert();

        System.out.println(flag);
    }
    public static  boolean flag = false;

    public static  Boolean  doRevert (){
        return !flag;
    }
}
