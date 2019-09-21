package com.study;

public class Demo03 {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long)s1 + s2;

        //错误的一种写法，String和long之间不能互相转换
        //String s4 = (String)(s3*s2);

        //正确的写法
        String s4  = String.valueOf(s3 * s2);
        System.out.println("Sum is " + s4);
    }
}
