package com.study_oct31;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrenTimePrintTest01 {
    static void showLongTime(CurrentTimePrint timePrinter){
        timePrinter.printCurrentTime();
    }

    public static void main(String[] args) {
            showLongTime(()->{
                Date date=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String s = sdf.format(date);
                System.out.println(s);
            });
    }
}
