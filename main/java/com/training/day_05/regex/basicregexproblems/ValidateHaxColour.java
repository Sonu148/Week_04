package com.training.day_05.regex.basicregexproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHaxColour {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // taking input from user
        System.out.print("Input the hax colour: ");
        String colour= input.nextLine();

        // define the regex pattern
        String regex= "^#[0-9A-Fa-f]{6}";

        Pattern pattern = Pattern.compile(regex);

        // matching user input from pattern
        Matcher matcher = pattern.matcher(colour);

        if(matcher.matches()){
            System.out.println("match: "+ matcher.group());
        }
        else{
            System.out.println("Invalid hex colour");
        }
    }

}
