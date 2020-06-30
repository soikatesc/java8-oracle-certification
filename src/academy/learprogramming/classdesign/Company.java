package academy.learprogramming.classdesign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {
    private String name;
    private List<String> employees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(String name) {
        if (name == null) {
            System.out.println("cant add null employee");
            return;
        }
        this.employees.add(name);
    }

    public void printSorted () {
        System.out.println("companyName = " + name);
        Collections.sort(employees);
        System.out.println("sorted = " + employees);
    }

}
