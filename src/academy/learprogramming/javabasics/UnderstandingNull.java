package academy.learprogramming.javabasics;

public class UnderstandingNull {

    static  Object myObj = new Object();
    static Object myOtherObj;

    static String myString;

    public static void main(String[] args) {
        // Null means reference to nothing
        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myLocalObject = " + myLocalObject);
        //System.out.println("anotherLocalObject" + anotherLocalObject);

        System.out.println("myObj = " + myObj);
        System.out.println("myOtherObj = " + myOtherObj);

        System.out.println("name = " + name );
        System.out.println("anotherName = " + anotherName);

        myString.toLowerCase();
        System.out.println("myString = " + myString);
    }
}
