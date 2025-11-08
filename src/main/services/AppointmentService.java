package main.services;

import main.models.Appointment;
import main.utils.FileManager;
import java.util.*;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment a) {
        appointments.add(a);
        FileManager.saveAppointment(a);
    }

    public List<Appointment> getAppointments() {
        return FileManager.loadAppointments();
    }
}
