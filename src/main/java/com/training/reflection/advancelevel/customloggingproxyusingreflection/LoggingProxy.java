package com.training.reflection.advancelevel.customloggingproxyusingreflection;

import java.lang.reflect.Proxy;

public class LoggingProxy {
    public static void main(String[] args) {
        // Create an instance of the greeting
        Greeting greeting = new GreetingImpl();

        // Create a dynamic proxy that intercepts method calls
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                (proxy, method, methodArgs) -> {
                    // Log method name
                    System.out.println("Method called: " + method.getName());
                    // Call the original method
                    return method.invoke(greeting, methodArgs);
                });

        // Call the method on the proxy instance
        proxyInstance.sayHello("Sonu");
    }
}
