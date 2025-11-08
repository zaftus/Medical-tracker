package test;

import main.models.Patient;
import main.services.PatientService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MediTrackTests {
    @Test
    public void testAddPatient() {
        PatientService ps = new PatientService();
        Patient p = new Patient("PAT-1234", "Alice", 30, "Flu");
        ps.addPatient(p);
        assertNotNull(ps.findPatientById("PAT-1234"));
    }
}
