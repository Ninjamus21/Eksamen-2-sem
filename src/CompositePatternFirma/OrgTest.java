package CompositePatternFirma;

public class OrgTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("Anders", 45000);
        Employee e2 = new Employee("Mette", 52000);
        Employee e3 = new Employee("Lars", 38000);
        Employee e4 = new Employee("Sofie", 61000);

        Department dev = new Department("Udvikling");
        dev.add(e1);
        dev.add(e2);

        Department marketing = new Department("Marketing");
        marketing.add(e3);
        marketing.add(e4);

        Department company = new Department("Firma");
        company.add(dev);
        company.add(marketing);

        company.print("");
        System.out.println("\nTotal lønsum: " + company.getSalary() + " kr");
    }
}
