package com.study;

public class Demo18 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duck1");
        String str1 = sb1.toString();

        String str2 = str1;

        String str3= new String(str1);

        String str4 = sb1.toString();

        String str5 = "Duck1";

        String str6 = String.valueOf(str1);

        System.out.println(str1 == str2);  //true 指向引用

        System.out.println(str3 == str1);  //false 创建新对象

        System.out.println(str4 == str2); //false 创建新对象

        System.out.println(str5 == str3);  //false  创建新对象

        System.out.println(str6 == str1);  //true  查找是否存在相同的变量
    }
}
