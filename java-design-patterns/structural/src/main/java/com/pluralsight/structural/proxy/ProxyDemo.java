package com.pluralsight.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Service service = new RealService();

        Service proxyInstance = (Service) java.lang.reflect.Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                new Class[]{Service.class},
                new LoggingInvocationHandler(service));

        proxyInstance.perform();
    }
}
