package com.study_oct31.stream_study;

import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        /*将流中的元素映射到另一个流中
        <R> Stream<R> map(Function<? super T, ? extends R> mapper);
         */

        /* public static<T> Stream<T> of(T... values) {
        return Arrays.stream(values);
    }
*/
        Stream<Integer>  stream=Stream.of(1,-2,-3,4,-5).map(Math::abs);
        //forEach();无返回值
       stream.forEach(System.out::println);
    }
}
