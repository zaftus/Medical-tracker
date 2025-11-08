package main.controllers;

import main.models.Patient;
import main.services.PatientService;
import main.utils.IDGenerator;
import java.util.Scanner;

public class PatientController {
    private final Scanner sc = new Scanner(System.in);
    private final PatientService patientService = new PatientService();

    public void registerPatient() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Condition: ");
        String condition = sc.nextLine();

        String id = IDGenerator.generateID("PAT");
        Patient patient = new Patient(id, name, age, condition);
        patientService.addPatient(patient);
        System.out.println("Patient Registered Successfully: " + id);
    }

    public void viewPatients() {
        patientService.getPatients().forEach(System.out::println);
    }
}
