package com.ilike.singleton.type6;

/**
 * 单例模式（双端检测，线程安全）
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式6，双重检查，线程安全");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class Singleton {

    private volatile static Singleton instance = null;

    private Singleton() {

    }

    /**
     * 提供静态的共有方法，等使用到该方法时，才去创建instance
     *   加入了双重检查的代码，解决线程安全问题
     *
     * @return
     */
    public  static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
