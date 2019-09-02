package com.ilike.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象工厂
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成一个代理对象
     *
     * @return
     */
    public Object getProxyInstance() {

        /**
         * loader：指定当前目标对象的类加载器，获取加载器的方法固定
         * interfaces：目标对象实现的接口类型，使用泛型的方式确认类型
         * h：事件处理，执行目标对象的方法，会触发事件处理器的方法，会把当前执行的目标方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始");
                //通过反射调用目标对象的方法
                Object returnValue = method.invoke(target, args);
                System.out.println("JDK代理结束");
                return returnValue;
            }
        });
    }
}
