package com.day_03.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteTextFile {
    public static void main(String[] args) {

        // define the source path
        String sourceFile= "src/main/java/com/day_03/filehandling/source.txt";
        String destination="src/main/java/com/day_03/filehandling/destination.txt";

        // create a file input stream and file out put object
        FileInputStream input=null;
        FileOutputStream output= null;

        try{
            input =new FileInputStream((sourceFile));
            output= new FileOutputStream(destination);

            int byteRead;
            // raed and write the file to another file
            while((byteRead=input.read())!=-1){
               output.write(byteRead);
            }
            System.out.println("File content is copy successfully");
        }
        catch(IOException e){

            System.out.println("An error occured"+ e.getMessage());
        }
    }

}
