package com.review.io.iofile;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        try {
            methdtwo();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("file operation failure");
        }
    }


    public static void methdone(){
        System.out.println(" 路径分隔符: "+ File.pathSeparator); // 路径分隔符: ;
        System.out.println(" 名称分隔符: "+ File.separator);//名称分隔符
        String parentPath = "D:/study" ;
        String file = "user.sql";
        //File src = new File(parentPath,file);
        File src = new File("D:/study/user.sql");
        System.out.println("src.getName: "+src.getName());
        System.out.println("src.getPath(): "+src.getPath());
        System.out.println("src.getAbsolutePath(): "+src.getAbsolutePath());
        System.out.println("src.getParent(): "+src.getParent());
        System.out.println("文件是否存在："+src.exists());
    }

    public static void methdtwo() throws IOException {
        String src = "D:/study/workplace/ceshi.txt";
        File file = new File(src);
        if(!file.exists()){
            boolean flag = file.createNewFile();
            System.out.println(flag?"successful":"failure");
        } else {
            System.out.println("文件已存在");
        }
    }

}
