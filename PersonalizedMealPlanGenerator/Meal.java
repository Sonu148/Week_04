package com.day_01.PersonalizedMealPlanGenerator;

class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public boolean validateMealPlan() {
        return meal.getMealDetails() != null && !meal.getMealDetails().isEmpty();
    }

    public void generateMealPlan(){
        if(validateMealPlan()){
            System.out.println("The meal plan is valid and plan details generated .");
            System.out.println(meal.getMealDetails());
        }
        else {
            System.out.println("The meal plan is invalid .");
        }
    }
}