package com.day_04;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UnchedkedException {
    public  static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        try{
            // take number from user
            System.out.println("Enter  the number :");
            int num1=scanner.nextInt();
            System.out.println("Enter  the number :");
            int num2=scanner.nextInt();

            // calculate the division result
            int result= num1/num2;
            System.out.println("The division result: "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("Can not divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("input valid number ");
        }
        finally {
            scanner.close();
        }
    }
}
