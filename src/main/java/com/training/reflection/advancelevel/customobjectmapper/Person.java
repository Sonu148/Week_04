package com.training.reflection.advancelevel.customobjectmapper;
class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "name='" + name + "', age=" + age;
    }
}