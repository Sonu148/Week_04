package com.training.reflection.advancelevel.customloggingproxyusingreflection;

class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        // Simple greeting message
        System.out.println("Hello, " + name);
    }
}
