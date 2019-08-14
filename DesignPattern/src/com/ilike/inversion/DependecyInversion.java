package com.ilike.inversion;


/**
 * 依赖倒置
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}


class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }


}

/**
 * 电子邮件
 */
 class Email {

    public String getInfo(){
        return "电子邮件:你好";
    }
}