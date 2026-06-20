package Singleton;

public class HospitalTest {
    public static void main(String[] args) {

        PatientRegistry registry1 = PatientRegistry.getInstance();
        PatientRegistry registry2 = PatientRegistry.getInstance();

        Patient patient1 = new Patient("Anders Hansen", 30);
        Patient patient2 = new Patient("Mette Nielsen", 30);
        Patient patient3 = new Patient("Lars Pedersen", 30);

        registry1.addPatient(patient1);
        registry1.addPatient(patient2);
        registry2.addPatient(patient3);

        System.out.println("Samme instans: " + (registry1 == registry2));
        System.out.println("Antal patienter: " + registry1.getPatientCount());
        registry1.printAll();
    }
}
