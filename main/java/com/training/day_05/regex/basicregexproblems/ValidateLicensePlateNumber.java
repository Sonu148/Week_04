package com.training.day_05.regex.basicregexproblems;
import java.util.Scanner;
import java.util.regex.*;

public class ValidateLicensePlateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // taking the user input
        System.out.println("Input the license plate number : ");
        String number= input.nextLine();

        // design the regex pattern
        String regex= "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher= pattern.matcher(number);

        if(matcher.matches()){
            System.out.println(matcher.group()+"  is valid ");
        }
        else{
            System.out.println(number+" is invalid ");
        }

    }
}
