package Singleton;

import java.util.ArrayList;
import java.util.List;

public class PatientRegistry {
    private static PatientRegistry uniqueInstance;
    private String navn;
    private List<Patient> patientList;

    private PatientRegistry() {
        this.navn = navn;
        this.patientList = new ArrayList<>();
    }

    public static PatientRegistry getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new PatientRegistry();
        }
        return uniqueInstance;
    }
    public void addPatient(Patient patient){
        patientList.add(patient);
    }

    public int getPatientCount(){
        return patientList.size();
    }

    public void printAll(){
        for (Patient patient : patientList) {
            System.out.println(patient);
        }
    }
    public void reset() {
        patientList.clear();
    }

}
