package com.study_oct31.stream_study;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");
        //forEach();无返回值
        //、取出前2个元素并在控制台打印输出。
        list.stream().limit(2).forEach(System.out::println);
        //取出后2个元素并在控制台打印输出。
        list.stream().skip(2).forEach(System.out::println);
    }
}
