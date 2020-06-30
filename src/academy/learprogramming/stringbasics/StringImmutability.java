package academy.learprogramming.stringbasics;

public class StringImmutability {
    public static void main(String[] args) {
        String hello = "hello";
        String hi = hello + "world";
        hi = hello; // reinitializing again

        System.out.println(hi + hello);

        hello = hello.toUpperCase();
        System.out.println(hello);

        // concat
        String s1 = "1";
        String s2 = s1.concat("2");
        s2 = s2.concat("3");

        System.out.println(s1);
        System.out.println(s2);
    }
}
