package com.training.annotations.advancedproblem.jsonfield;

public class JsonFieldMain {

    public static void main(String[] args) {
        User user = new User("Sonu", 21);
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
