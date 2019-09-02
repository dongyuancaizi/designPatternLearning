package com.ilike.proxy.dynamic;

public class Client2 {

    public static void main(String[] args) {
        //创建目标对象
        IIeacherDao iIeacherDao = new TeacherDao();
        //给目标对象创建代理对象,可以强转为IIeacherDao
        ProxyFactory proxyFactory = new ProxyFactory(iIeacherDao);
        IIeacherDao  instance = (IIeacherDao) proxyFactory.getProxyInstance();
        //内存中动态生成了代理对象
        System.out.println(instance.getClass());
       // instance.teach();
        instance.sayHello("tom");
    }
}
