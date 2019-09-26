package com.study;

public class Demo28 {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuffer("JAVA SE 8"));
        System.out.println("Hello " + new  MyString("JAVA SE 8"));
    }
}
class MyString {
    String msg ;
    MyString (String msg){
        this.msg= msg;
    }

    /**
     * toString() 方法
     * @return
     */
    @Override
    public String toString() {
        return msg.toString();
    }
}
