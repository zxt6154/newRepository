package com.study_oct31.stream_study;

import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        String[] arr={"黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏"};
        Stream<String>  stream=Stream.of(arr);
        // <A> A[] toArray(IntFunction<A[]> generator);返回数组类型
            String[] guo=stream.filter(s->s.startsWith("郭")).toArray(String[]::new);
    }
}
