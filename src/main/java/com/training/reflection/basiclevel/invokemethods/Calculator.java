package com.training.reflection.basiclevel.invokemethods;

public class Calculator {
    private int a,b;
    // constructor for  Calculator class
    public Calculator(int a, int b){
        this.a=a;
        this.b=b;
    }
    // getter method
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    private void multiply(int a, int b){
        System.out.println("Multiply: "+a*b);
    }
}
