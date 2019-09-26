package com.study;

public class Demo24 {
    public static void main(String[] args) {
        //three space
        String str = "   ";

        String str2 = str.trim();

        System.out.println(str.equals(""));
        System.out.println(str.isEmpty());


        System.out.println(str2.equals(""));
        System.out.println(str2.isEmpty());
    }
}
