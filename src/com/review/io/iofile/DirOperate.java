package com.review.io.iofile;

import java.io.File;

public class DirOperate {
    //mkdie  需要有真实父目录，没有则不创建
    //mkdirs  没有父目录则一同创建
    public static void main(String[] args) {
        methodone();
    }
    public static void methodone(){
        String file = "D:/study/workplace/parent/test";
        File src = new File(file);
        //boolean mkdir = src.mkdir();
        //System.out.println(mkdir?"successful":"failure");
        boolean mkdirs = src.mkdirs();
        System.out.println(mkdirs?"successful":"failure");
    }
}
