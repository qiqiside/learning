package me.learn.DesignPattern.Structural.Proxy;

import me.learn.DesignPattern.utils.Util;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    public Subject getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(this);

        return (Subject) enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Util.show(this, "transfer to realSubject." + method.getName());
        return methodProxy.invokeSuper(o, objects);
    }

}
