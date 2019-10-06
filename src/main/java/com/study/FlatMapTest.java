package com.study;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {

        /**
         * flatmap
         */
        String[][] strs = {{"a"},{"c"},{"d","e"}};

        Arrays.asList(strs).stream().flatMap(x -> Stream.of(x)).forEach(System.out::println);
    }
}
