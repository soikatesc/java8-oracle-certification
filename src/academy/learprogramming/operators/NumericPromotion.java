package academy.learprogramming.operators;

public class NumericPromotion {

    public static void main(String[] args) {
        // promotion is converting "smaller"  into "bigger" type
        int x = 5;
        double y = 10.55;


        System.out.println("x + y = " + (x + y));

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result = b + c + d;
        System.out.println("Result = " + result);

        // Casting is converting "bigger" type to "smaller"
        double myDouble = 5.55;
        int myInt = 4 + (int) myDouble;
        System.out.println("Result = " + myInt);

        int anotherInt = 125;
        byte myByte = 15;

        int intResult = anotherInt + myByte;
        byte byteResult = (byte) (anotherInt + myByte);

        System.out.println("IntResult = " + intResult);
        System.out.println("ByteResult = " + byteResult); //overflow

        short shortx = 14;
        short shorty= 6;
        System.out.println(shortx/shorty);
        //short r = shortx/shorty;

        double doublex = 44.25;
       // float floaty = 3.35;
        System.out.printf("");
    }
}
