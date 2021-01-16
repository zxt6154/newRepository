package com.study_oct31.stream_study;

import com.study_oct25.Stu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test05 {
    public static void main(String[] args) {
        /*1. 第一个队伍只要名字为3个字的成员姓名；
            2. 第一个队伍筛选之后只要前6个人；
            3. 第二个队伍只要姓张的成员姓名；
            4. 第二个队伍筛选之后不要前1个人；
            5. 将两个队伍合并为一个队伍；
            6. 根据姓名创建Student对象；
            7. 打印整个队伍的Student对象信息。*/
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");
        /*1. 第一个队伍只要名字为3个字的成员姓名；
            2. 第一个队伍筛选之后只要前6个人；*/
 Stream<String> strone=one.stream().filter(s->s.length()==3).limit(6);
            /*  3. 第二个队伍只要姓张的成员姓名；
            4. 第二个队伍筛选之后不要前1个人；*/
 Stream<String> strtwo=two.stream().filter(s->s.startsWith("张")).skip(1);
 //  5. 将两个队伍合并为一个队伍；
        List<String> all=Stream.concat(strone,strtwo).collect(Collectors.toList());
        for (String s : all) {
            System.out.println(s);
        }
        /*  6. 根据姓名创建Student对象；
            7. 打印整个队伍的Student对象信息。*/
        System.out.println("===============");
        List<String> list=new ArrayList<>();
        list.addAll(all);
        for (String i : list) {
            System.out.println(i);
        }
        //Stream.concat(strone,strtwo).map(Student::new).forEach(System.out::println);
    }
    }
