package com.study_oct31.stream_study;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        String[] arr1={"郭靖","杨康"};
        String[] arr2={"黄蓉","穆念慈"};
        Stream<String> list=Stream.concat(Stream.of(arr1),Stream.of(arr2));
        List<String> lst=list.collect(Collectors.toList());

    }
}
