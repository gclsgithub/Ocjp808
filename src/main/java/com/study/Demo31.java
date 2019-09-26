package com.study;


import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class Demo31 {
    public static void main(String[] args) {

        /**
         * 如果数组是基础类型的使用Arrays.asList()方法生成的就是一个[][]二维数组,基础类型的才是生成的数组
         */
        int[] arrInt = {12,14,19,20};
        Arrays.asList(arrInt).forEach(System.out::println);

        Integer[] arrInt2 = {1,2,3,4};
        Arrays.asList(arrInt2).forEach(System.out::println);
    }
}
