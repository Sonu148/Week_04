package com.day_01.PersonalizedMealPlanGenerator;

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        vegetarianMeal.generateMealPlan();
        Meal<NonVegetarianMeal> nonVegetarianMeal = new Meal<>(new NonVegetarianMeal());
        nonVegetarianMeal.generateMealPlan();
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        veganMeal.generateMealPlan();

    }
}