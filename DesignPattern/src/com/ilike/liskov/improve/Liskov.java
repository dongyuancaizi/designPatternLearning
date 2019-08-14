package com.ilike.liskov.improve;

/**
 * 里式替换原则
 */
public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.fun1(11, 3));
        System.out.println("1-8=" + a.fun1(1, 8));

        System.out.println("----------------------");
        //因为B类不再继承A类，因此调用者不会认为调用fun1是减法
        B b = new B();
        System.out.println("11+3=" + b.fun1(11, 3));
        System.out.println("1+8=" + b.fun1(1, 8));
        System.out.println("11+3+9=" + b.fun2(11, 3));
        System.out.println("----------------------");
        //使用组合任然可以使用A的方法
        System.out.println("11-3=" + b.fun3(11, 3));
    }
}

/**
 * 创建一个更加基础的类
 */
class Base {

}


class A extends Base {

    public int fun1(int a, int b) {
        return a - b;
    }
}

/**
 * b类继承A类
 */
class B extends Base {
    //B类使用A类的方法，使用组合关系
    private A a = new A();

    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }
    //仍然使用A的方法
    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }
}
