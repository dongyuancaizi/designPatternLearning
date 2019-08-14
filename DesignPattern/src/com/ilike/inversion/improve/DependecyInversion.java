package com.ilike.inversion.improve;


/**
 * 依赖倒置(优化版)
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}


class Person{
    public void receive(Irceiver irceiver){
        System.out.println(irceiver.getInfo());
    }


}

interface  Irceiver{
    public String getInfo();

}

/**
 * 电子邮件
 */
 class Email implements  Irceiver{

    public String getInfo(){
        return "电子邮件:你好";
    }
}

/**
 * 微信消息
 */
class WeiXin implements  Irceiver{

    public String getInfo(){
        return "微信消息:ok";
    }
}