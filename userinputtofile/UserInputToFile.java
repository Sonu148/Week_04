package com.day_03.userinputtofile;
import java.io.*;

public class UserInputToFile {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // taking the user name
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // taking the user age
            System.out.print("Enter your age: ");
            String age = reader.readLine();

            // taking the user programming language
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write data to file
            FileWriter writer = new FileWriter("src/main/java/com/day_03/userinputtofile/userInfo.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            writer.close();

            System.out.println("Data saved to userInfo.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
