package com.ilike.singleton.type2;

/**
 * 饿汉式（静态代码块）
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}

/**
 * 单例模式（饿汉式）
 */
class Singleton {
    /**
     * 1.构造器私有化，外部不能new
     */
    private Singleton(){
    }


    /**
     * 2.本类内部创建对象实例
     */
    private final static  Singleton instance;

    /**
     * 在静态代码块中创建单例对象
     */
    static {
        instance=new Singleton();
    }

    /**
     * 3.提供共有的静态方法，返回实例对象
     */
    public static Singleton getInstance(){
        return instance;
    }

}