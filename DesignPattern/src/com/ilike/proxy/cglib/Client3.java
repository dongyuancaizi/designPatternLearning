package com.ilike.proxy.cglib;

public class Client3 {

    public static void main(String[] args) {
        //1.创建目标对象
        TeacherDao target = new TeacherDao();
        //2.获取代理对象.并且将目标对象传递给代理对象
        TeacherDao proxyFactory =(TeacherDao) new ProxyFactory(target).getProxyInstance();
        //3.执行代理对象的方法，出发intercept,从而实现对目标对象的调用
        proxyFactory.teach();

    }
}
