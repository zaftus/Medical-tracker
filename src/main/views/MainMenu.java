package main.views;

import main.controllers.PatientController;
import java.util.Scanner;

public class MainMenu {
    private final Scanner sc = new Scanner(System.in);
    private final PatientController patientController = new PatientController();

    public void display() {
        int choice;
        do {
            System.out.println("\n===== MediTrack Hospital System =====");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> patientController.registerPatient();
                case 2 -> patientController.viewPatients();
                case 0 -> System.out.println("Exiting MediTrack...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
