package com.ilike.singleton.type7;

/**
 * 单例模式（静态内部类，线程安全）
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式7，静态内部类，线程安全");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

/**
 * 单例模式（静态内部类）
 */
class Singleton {
    private static class SingletonInstance {
        private final static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}