package com.training.reflection.intermediatelevel.dynamicmethodinvocation;

import static java.lang.Math.abs;

public class MathOperations {

    // method for addition
    public void add(int a, int b){
        System.out.println("Addition: "+(a+b));
    }
    // method for subtract
    public void subtract(int a, int b){
        System.out.println("Subtract: "+abs(a-b));
    }
    // method for multiply
    public void multiply(int a, int b){
        System.out.println("Multiply: "+a*b);
    }
}
