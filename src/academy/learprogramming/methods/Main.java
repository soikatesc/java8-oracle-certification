package academy.learprogramming.methods;

public class Main {
    public static void main(String[] args) {
        MethodReturnType methodReturnType = new MethodReturnType();
        methodReturnType.jump3();

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4); // not used

        System.out.println(s1);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }
}
