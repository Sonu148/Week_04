package com.day_04;
import java.util.Scanner;

class CustomException{
static class InvalidAgeException extends Exception{
        // constructor to pass the error message to parent class
        public InvalidAgeException(String message){
            super(message);
        }
  }
        // class for validation age
        public class AgeValidation{
            public static void validateAge(int age) throws InvalidAgeException{
                // checking the condition
                if(age<18){
                    throw new InvalidAgeException("Age is less than 18");
                }
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // taking the age of the user
            System.out.println("Enter the age");
            int age= scanner.nextInt();

          try{
              // validate is it valid or not
              AgeValidation.validateAge(age);
              // valid then print the message
              System.out.println("You are valid");
            }catch(InvalidAgeException e){
            System.out.println("Age is less than 18");
        }
      }
    }