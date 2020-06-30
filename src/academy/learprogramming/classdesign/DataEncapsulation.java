package academy.learprogramming.classdesign;

public class DataEncapsulation {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("MyCompay");
        company.addEmployee("soikat");
        company.addEmployee(null);
        company.printSorted();
    }
}
