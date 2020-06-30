package academy.learprogramming.classdesign.classinheritance;

public abstract  class Animal {
    private int age;
    private String name;

    public Animal (int age) {
        System.out.println("Animal");
        this.age = age;
        System.out.println("animal default name = " + name +" age = " + age);
    }

    public Animal() {
        System.out.println("animal default name = " + name +" age = " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age = " + age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.println("name = " + name + " age = " + age);
    }

    public void eat () {
        System.out.println("Animal is eating");
    }

    public double getAverageWeight () {
        return 10;
    }
}
