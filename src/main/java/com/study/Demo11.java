package com.study;

public class Demo11 {
    public static void main(String[] args) throws Exception {
        Test1 te = new Test1();
        int no = 12344;
        te.readTest(no);//n1
        te.chedk(no);

    }
}

class Test1 {
    void readTest(int no) throws Exception {
        System.out.println("a");
    }

    void chedk(int no) throws RuntimeException {
        System.out.println("vv");
    }
}
