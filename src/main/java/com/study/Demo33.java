package com.study;

public class Demo33 {
    public static void main(String[] args) {


        Long time1 = System.currentTimeMillis();
        Long sum = 0L;

        /**
         *正确的方式防止了自动装箱
         */
        for (Long i = 0L; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println(sum);

        Long time2 = System.currentTimeMillis();

        System.out.println(time2-time1);



        Long time3 = System.currentTimeMillis();
        Long sum1 = 0L;

        /**
         * 错误的方式 long 在加的时候会将i给自动装箱,
         */
        for (long i = 0L; i < Integer.MAX_VALUE; i++) {
            sum1 += i;
        }

        System.out.println(sum);

        Long time4 = System.currentTimeMillis();

        System.out.println(time4-time3);
    }
}
