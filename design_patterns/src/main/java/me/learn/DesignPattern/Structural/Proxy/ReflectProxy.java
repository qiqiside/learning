package me.learn.DesignPattern.Structural.Proxy;

import me.learn.DesignPattern.utils.Util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ReflectProxy {

    private Subject realSubject;

    public ReflectProxy() {
        realSubject = new RealSubject();
    }

    public Subject getProxy() {
        return (Subject) java.lang.reflect.Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Util.show(this, "transfer to realSubject." + method.getName());
                return method.invoke(realSubject, args);
            }
        });
    }

}
