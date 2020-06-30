package academy.learprogramming.classdesign.classinheritance;

public class Husky extends Dog {
    public Husky(int age) {
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Husky is eating");
    }
}
