package main.services;

import main.models.Patient;
import main.utils.FileManager;
import java.util.*;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
        FileManager.savePatient(p);
    }

    public List<Patient> getPatients() {
        return FileManager.loadPatients();
    }

    public Patient findPatientById(String id) {
        for (Patient p : patients) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }
}
