package Singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientRegistryTest {

    @BeforeEach
    void setup() {
        PatientRegistry.getInstance().reset();
    }

    @Test
    void kontrolAfSingelton(){
        // assign
        PatientRegistry patientRegistry = PatientRegistry.getInstance();
        Patient patient1 = new Patient("Henrik", 22);
        patientRegistry.addPatient(patient1);
        // act
        PatientRegistry patientRegistry1 = PatientRegistry.getInstance();

        // assert
        assertEquals(1, patientRegistry1.getPatientCount());
        assertEquals(1, patientRegistry.getPatientCount());
    }

    @Test
    void testAfPatientTilføjesKorrekt(){
        // assign
        PatientRegistry patientRegistry = PatientRegistry.getInstance();
        Patient patient1 = new Patient("Henrik", 22);
        Patient patient2 = new Patient("Peter", 22);
        Patient patient3 = new Patient("Ulrik", 22);
        // act
        patientRegistry.addPatient(patient1);
        patientRegistry.addPatient(patient2);
        // assign
        assertEquals(2, patientRegistry.getPatientCount());
        patientRegistry.addPatient(patient3);
        assertEquals(3, patientRegistry.getPatientCount());
    }
}