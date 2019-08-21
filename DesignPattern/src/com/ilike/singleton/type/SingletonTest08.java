package com.ilike.singleton.type;

public class SingletonTest08 {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式8，枚举，线程安全");
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1==instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.sayOk();
    }
}

enum Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("我是枚举");

    }
}
