package com.review.io.iofile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class DirOperate {
    //mkdie  需要有真实父目录，没有则不创建
    //mkdirs  没有父目录则一同创建
    public static void main(String[] args) {
        methodthree();
    }
    public static void methodone(){
        String file = "D:/study/workplace/parent/test";
        File src = new File(file);
        //boolean mkdir = src.mkdir();
        //System.out.println(mkdir?"successful":"failure");
        boolean mkdirs = src.mkdirs();
        System.out.println(mkdirs?"successful":"failure");
    }
    public static void methodtwo(){
        String file = "D:/study/workplace/ImportantStart";
        File src = new File(file);
       if(src.isDirectory()){
           String[] subNames = src.list();
           for (String subName:subNames) {
              // System.out.println(subName);
              /* .git
                 .idea
                 desktop.ini
                 ImportantStart.iml
                 out
                src*/
           }
           File[] files = src.listFiles();
           for (File tempfile : files) {
              // System.out.println(tempfile.getAbsolutePath());
              /* D:\study\workplace\ImportantStart\.git
               D:\study\workplace\ImportantStart\.idea
               D:\study\workplace\ImportantStart\desktop.ini
               D:\study\workplace\ImportantStart\ImportantStart.iml
               D:\study\workplace\ImportantStart\out
               D:\study\workplace\ImportantStart\src*/
           }
           files = src.listFiles(new FilenameFilter() {
               @Override
               public boolean accept(File dir, String name) {
                  // System.out.println(dir.getName());
                   return new File(dir,name).isFile()&&name.endsWith(".iml");
               }
           });
           for(File tem:files){
               System.out.println(tem.getAbsolutePath());
           }
       }
    }
    //输出子孙级目录或者文件名称
    public static void methodthree(){
        String path = "D:/study/workplace/ImportantStart";
        File src = new File(path);
        File[] roots = File.listRoots();
        System.out.println("根节点输出测试： "+ Arrays.toString(roots));
        printNames(src);

        }
        public static void printNames(File src){
            if(null == src || !src.exists()){
                return;
            }
                System.out.println("递归输出子孙级文件名绝对路径： "+src.getAbsolutePath());
            if(src.isDirectory()){
                for (File sub : src.listFiles()) {
                    printNames(sub);
                }
            }
        }

}
