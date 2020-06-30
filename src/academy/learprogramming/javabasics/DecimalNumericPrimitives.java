package academy.learprogramming.javabasics;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {

        float myNumber = 24.4f;

        //double before = 10_.25; // doesnt compile
        //double after = 10._25 // does not compile
        //double first = _10.95 // does not compile
        //double last = 10.95_; // does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54f;
        double anotherDouble = 2.45d; // By default all decimal number is double, so no d required
        double scientific = 5.000125E03;
        double scientific2 = 5.000125E3;
        double myDouble3 = 5000.125;

        System.out.println("scientific = " + scientific);
        System.out.println("scientific1 = " + scientific2);

        double hexPi = 0x1.91eb8515fp1; // p indicates hexadecimal floating number
        System.out.println(hexPi);
    }
}
