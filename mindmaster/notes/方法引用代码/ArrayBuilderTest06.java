package com.study_oct31;

public class ArrayBuilderTest06 {
    public static void main(String[] args) {
getIntegerArray(4,Integer[]::new);
//        return new Integer[len];
    }
    //2.使用builder创建一个长度为length的Integer数组并打印其内存地址
    static void getIntegerArray(int length , ArrayBuilder<Integer> builder){
        System.out.println(builder.buildArray(length));
    }
}
