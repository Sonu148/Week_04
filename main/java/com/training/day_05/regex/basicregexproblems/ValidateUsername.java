package com.training.day_05.regex.basicregexproblems;
import java.util.Scanner;
import java.util.regex.*;

public class ValidateUsername {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // taking input from user
        System.out.print("Input the user name: ");
        String userName= input.nextLine();

        // define the regex pattern
        String regex= "^[a-zA-Z][a-zA-Z0-9_]{4,14}";

        Pattern pattern = Pattern.compile(regex);

        // matching user input from pattern
        Matcher matcher = pattern.matcher(userName);

        if(matcher.matches()){
            System.out.println("match: "+ matcher.group());
        }
        input.close();
    }
}
