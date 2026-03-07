package com.pluralsight.structural.proxy;

import java.lang.reflect.*;

public class LoggingInvocationHandler implements InvocationHandler{
    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging Before: Invoking method " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("Logging After: Invoking method " + method.getName());

        return result;
    }
}
