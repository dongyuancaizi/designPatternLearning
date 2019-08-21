package com.ilike.singleton.type4;

/**
 * 单例模式（懒汉式，线程安全）
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式2，线程安全");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    /**
     * 提供静态的共有方法，等使用到该方法时，才去创建instance
     *   加入了同步处理的代码，解决线程安全问题
     *
     * @return
     */
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
