package com.study;

public class Demo13 {

    public static void main(String[] args) {
        int x = 100 ;
        int a = x++; //100
        int b = ++x; // 102
        int c = x++; // 102
        int d = (a < b) ? (a < c) ? a : (b  <  c) ? b : c: 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
