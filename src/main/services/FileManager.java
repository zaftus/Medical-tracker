package main.utils;

import main.models.*;
import java.io.*;
import java.util.*;

public class FileManager {
    private static final String PATIENT_FILE = "data/patients.txt";
    private static final String APPOINTMENT_FILE = "data/appointments.txt";
    private static final String BILL_FILE = "data/bills.txt";

    public static void savePatient(Patient patient) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATIENT_FILE, true))) {
            writer.write(patient.toString());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error saving patient data.");
        }
    }

    public static List<Patient> loadPatients() {
        List<Patient> patients = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATIENT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" \\| ");
                if (data.length >= 4) {
                    patients.add(new Patient(data[0], data[1], Integer.parseInt(data[2].replace("Age: ", "")), data[3].replace("Condition: ", "")));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading patient data.");
        }
        return patients;
    }

    public static void saveAppointment(Appointment a) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(APPOINTMENT_FILE, true))) {
            writer.write(a.toString());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error saving appointment data.");
        }
    }

    public static List<Appointment> loadAppointments() {
        List<Appointment> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(APPOINTMENT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] d = line.split(" \\| ");
                if (d.length >= 4)
                    list.add(new Appointment(d[0], d[1].replace("Patient: ", ""), d[2].replace("Doctor: ", ""), d[3].replace("Date: ", "")));
            }
        } catch (IOException e) {
            System.err.println("Error reading appointments.");
        }
        return list;
    }

    public static void saveBill(Bill bill) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BILL_FILE, true))) {
            writer.write(bill.toString());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error saving bills.");
        }
    }

    public static List<Bill> loadBills() {
        List<Bill> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(BILL_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] d = line.split(" \\| ");
                if (d.length >= 3)
                    list.add(new Bill(d[0], d[1].replace("Patient: ", ""), Double.parseDouble(d[2].replace("Amount: $", ""))));
            }
        } catch (IOException e) {
            System.err.println("Error reading bills.");
        }
        return list;
    }
}
