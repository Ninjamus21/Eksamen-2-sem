package CompositePatternFirma;

public class Employee extends OrgComponent {
    private String navn;
    private int salary;

    public Employee(String navn, int salary) {
        this.navn = navn;
        this.salary = salary;
    }


    @Override
    public void print(String indent) {
        System.out.println(indent + "Medarbejder: " + navn + " Løn: " + salary);
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
