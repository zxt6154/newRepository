package com.study_oct31;

public class NumberToStringTest03 {
    public static  void  decToHex(int num,NumberToString nts){
          //使用nts将一个十进制整数转换成十六进制表示的字符串2.已知该行为与Integer类中的toHexString方法一致
          System.out.println(nts.convert(num));
    }
    public static void main(String[] args) {
            int n=9;
            decToHex(n,(m)->{return Integer.toHexString(m);});//
            decToHex(n, Integer::toHexString);
    }
}
