package academy.learprogramming.javabasics;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // Declaration is method signiture
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // the input is the parameter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
