package academy.learprogramming.classdesign;

public class Complex {

    private final double real;
    private final double imginary;

    public Complex (double real, double imginary) {
        this.real = real;
        this.imginary = imginary;
    }

    public double getReal () {
        return this.real;
    }

    public double getImginary() {
        return this.imginary;
    }

    public Complex plus (Complex b) {
        double newReal = real + b.real;
        double newImaginary = imginary + b.imginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex minus (Complex b) {
        double newReal = real - b.real;
        double newImaginary = imginary - b.imginary;
        return new Complex(newReal, newImaginary);
    }

    public static  Complex plus (Complex a, Complex b) {
        return a.plus(b);
    }

    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 5.0);

        Complex bPlusA = Complex.plus(a, b);
        System.out.println("bPlusA real = " + bPlusA.real + " img = " + bPlusA.imginary);
    }
}
