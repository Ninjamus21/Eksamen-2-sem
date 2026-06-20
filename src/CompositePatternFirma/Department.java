package CompositePatternFirma;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrgComponent{
    private String navn;
    private List<OrgComponent> orgComponents = new ArrayList<>();

    public Department(String navn) {
        this.navn = navn;
    }

    public void add(OrgComponent orgComponent){
        orgComponents.add(orgComponent);
    }
    @Override
    public void print(String indent) {
        System.out.println(indent + "Department: " + navn);
        for (OrgComponent orgComponent : orgComponents) {
            orgComponent.print(indent + "  ");
        }
    }

    @Override
    public int getSalary() {
        int total = 0;
        for (OrgComponent orgComponent : orgComponents) {
         total += orgComponent.getSalary();
        }
        return total;
    }
}
