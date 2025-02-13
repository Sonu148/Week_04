package com.day_03.datastreams.storeandretrieveprimitivedata;
import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {
        // Write data
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("studentData.data"))) {
            out.writeInt(1);
            out.writeUTF("Rohan");
            out.writeDouble(8.5);

            // saved the data if it write
            System.out.println("Student data saved.");
        } catch (IOException e) {
            System.out.println("Error during writing data: " + e.getMessage());
        }

        // Read data
        try (DataInputStream in = new DataInputStream(new FileInputStream("studentData.data"))) {
            int rollNumber = in.readInt();
            String name = in.readUTF();
            double GPA = in.readDouble();

            System.out.println("Student Details: Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + GPA);
        } catch (IOException e) {
            System.out.println("Error during reading data: " + e.getMessage());
        }
    }
}