package com.study;

public class Demo26 {
    public static void main(String[] args) {
        //String[] strs = {"a","b"};  n1

        String[] strs = new String[2]; //n2
        int index = 0;

        for (String str : strs){
            strs[index].concat(" element " + index);
            index++;
        }

        for (index = 0;index < strs.length ;index++){
            System.out.println(strs[index]);
        }
    }
}
