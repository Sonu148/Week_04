package com.day_03.bytearraystream;
import java.io.*;

public class ImageByteArray {

    public static void main(String[] args) {
        try {
            // image file path
            FileInputStream imageInput = new FileInputStream("src/main/java/com/day_03/bytearraystream/image.jpg");
            ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();

            // declare the byte read integer
            int byteRead;
            while ((byteRead = imageInput.read()) != -1) {
                byteArrayOutput.write(byteRead);
            }

            byte[] imageData = byteArrayOutput.toByteArray();

            // Write byte array back to another image file
            FileOutputStream imageOutput = new FileOutputStream("src/main/java/com/day_03/bytearraystream/copyImage.jpg");
            imageOutput.write(imageData);

            imageInput.close();
            byteArrayOutput.close();
            imageOutput.close();

            // display the output if copy successfully
            System.out.println("Image successfully copied.");
        } catch (IOException e) {
            // handle the exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
