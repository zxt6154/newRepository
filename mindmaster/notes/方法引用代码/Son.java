package com.study_oct31;

public class Son extends Father {
    public void askMoney(){
        System.out.println("向家中的财政老大要钱交(上)学(网)费(吧)...");
    }
    public void spendMoney(){
        System.out.println("去网吧付钱给网管开了一台机器...");
    }
    public void helpFather(Helper helper){
        helper.help();
    }
    public void daJangYou(){
        helpFather(super::askMoney);
        helpFather(super::spendMoney);
    }
}
