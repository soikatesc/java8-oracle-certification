package academy.learprogramming.javabasics;

public class WholeNumericPrivitives {

    public static void main(String[] args) {
        // Underscore can be anywhere expect start and beginning
        long max = 3214567_8888_888L;
        long n = 2_300;

        // octal (0-7)
        int oct = 07;
        int firstOct = 010; // 8 decimal
        int secondOct = 022; // 18 decimal

        int sumOct = firstOct + secondOct; // 26 decimal 32 octal
        System.out.println(sumOct + "Oct Sum = " + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; //15
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 decimal, 2d hex
        System.out.println("First = " + firstHex + " second = " + secondHex);
        System.out.println("decimalSum = " + sumHex + " hex = " + Integer.toHexString(sumHex));

        //Binary
        int firstBinary = 0b1001; // 9 decimal
        int secondBinary = 0b0111; // 7 decimal
        int sumBin = firstBinary + secondBinary;

        System.out.println("first => " + firstBinary + " second = " + secondBinary);
        System.out.println("Bin = " + sumBin);
    }
}
