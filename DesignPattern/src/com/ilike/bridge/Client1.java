package com.ilike.bridge;

public class Client1 {

    public static void main(String[] args) {
        //获取折叠手机
        FoldPhone phone1 = new FoldPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("===============");
        FoldPhone phone2 = new FoldPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("===============");
        UpRightPhone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();
        System.out.println("===============");
        UpRightPhone phone4 = new UpRightPhone(new Vivo());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
