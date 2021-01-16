package com.study_oct31;

public class NumberSupplierTest03 {
    //1.使用ns得到一个从1到num(包含1和num)之间的随机数并打印
      static void getRandomNumFromOneToNum(int num,NumberSupplier ns){
        System.out.println(ns.getNum(num));
    }
    //2.使用ns得到一个从a到b(包含a和b)之间的随机数并打印
    static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns){
        System.out.println(ns.getNum(a,b));
    }
    //3.使用ns从数组nums中获取一个随机元素并打印
    static void  getRandomNumFromArray(int[] nums, NumberSupplier ns){
        System.out.println(ns.getNum(nums));
    }

    public static void main(String[] args) {
          RandomUtil ru=new RandomUtil();
        //1.使用ns得到一个从1到num(包含1和num)之间的随机数并打印
        //r.nextInt(4);
        //  r.nextInt(4)+1;//Extract side effect
      getRandomNumFromOneToNum(10, ru::nextInt);
        getRandomNumFromOneToNum(10, ru::nextInt);
        getRandomNumFromAToB(10, 20, ru::nextInt);
        int[] arr = {2, 4, 6, 8};
        getRandomNumFromArray(arr, ru::nextInt);
    }
}
