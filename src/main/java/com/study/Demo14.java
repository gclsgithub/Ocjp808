package com.study;

public class Demo14 {
    public static void main(String[] args) {
        String [][] chrs = new String[2][];
        chrs[0]  = new String[2];
        chrs[1] =  new String[5];
        int i = 97;
        for (int a = 0; a< chrs.length;a++){
            for (int b = 0;b < chrs.length ; b++){
                chrs[a][b] = ""+i;
                i++;
            }
        }
    }
}
