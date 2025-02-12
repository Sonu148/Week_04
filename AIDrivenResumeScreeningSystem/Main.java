package com.day_01.AIDrivenResumeScreeningSystem;
import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            // Create resumes for different job roles
            Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Rohan");
            softwareEngineerResume.addJobRole(new SoftwareEngineer());

            Resume<DataScientist> dataScientistResume = new Resume<>("Satyam");
            dataScientistResume.addJobRole(new DataScientist());

            Resume<ProductManager> productManagerResume = new Resume<>("Aman");
            productManagerResume.addJobRole(new ProductManager());

            // Print resumes
            System.out.println("Resumes:");
            softwareEngineerResume.printResume();
            System.out.println();
            dataScientistResume.printResume();
            System.out.println();
            productManagerResume.printResume();
            System.out.println();

            // Screening pipeline
            List<JobRole> allJobRoles = new ArrayList<>();
            allJobRoles.add(new SoftwareEngineer());
            allJobRoles.add(new DataScientist());
            allJobRoles.add(new ProductManager());

            System.out.println("Screening Pipeline:");
            ScreeningPipeline.screenResumes(allJobRoles);
        }
    }
