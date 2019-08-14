package com.ilike.segregation;

/**
 * 接口隔离原则
 */
public class Segregation1 {

    public static void main(String[] args) {
        //A类通过接口依赖B类
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        //C类通过接口依赖D类
        C c = new C();
        c.depend1(new D());
        c.depend2(new D());
        c.depend3(new D());
    }

}

class A{
    /**
     * A类通过接口使用Interface1使用接口1,2,3方法
     * @param interface1
     */
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }

    public void depend2(Interface2 interface1){
        interface1.operation2();
    }
    public void depend3(Interface2 interface1){
        interface1.operation3();
    }
}


class C{
    /**
     * A类通过接口使用Interface1使用接口1,4,5方法
     * @param interface1
     */
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }

    public void depend2(Interface3 interface1){
        interface1.operation4();
    }
    public void depend3(Interface3 interface1){
        interface1.operation5();
    }
}


/**
 * 接口1
 */
interface Interface1 {
    void operation1();
}

/**
 * 接口2
 */
interface Interface2 {

    void operation2();

    void operation3();
}


/**
 * 接口3
 */
interface Interface3 {

    void operation4();

    void operation5();
}


/**
 * 类B
 */
class B implements Interface1,Interface2{

    @Override
    public void operation1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3");
    }

}
/**
 * 类D
 */
class D implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5");
    }
}