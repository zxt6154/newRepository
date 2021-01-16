package com.study_oct31;

public class IntcalTest02 {
    public static  void getProduct(int a,int b,IntCalc calc){
        System.out.println(calc.calc(a, b));
    }
    public static void main(String[] args) {
                    /*        int a=3;
                            int b=9;*/
                          getProduct(3,9,
                                            (m,n)->{return m*n;});
    }
}
