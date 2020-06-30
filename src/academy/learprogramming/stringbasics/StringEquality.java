package academy.learprogramming.stringbasics;

public class StringEquality {
    public static void main(String[] args) {
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn";
        String newName = new String("John");

        // To check object equality
        System.out.println("name = anotherName => " + (name == anotherName));
        System.out.println("name = john = > " + (name == john));
        System.out.println("name = newName => " + (name == newName));

        System.out.println("name - idenityHashCode = > " + System.identityHashCode(name));
        System.out.println("name - idenityHashCode = > " + System.identityHashCode(john));
        System.out.println("name - idenityHashCode = > " + System.identityHashCode(newName));

        System.out.println("name = anotherName => " + (name.equals(anotherName)));

        //
        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
