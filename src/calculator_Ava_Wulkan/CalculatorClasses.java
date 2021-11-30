package calculator_Ava_Wulkan;

public class CalculatorClasses {

    public static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Nämnaren får inte vara negativ");
        } else {
            double result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
    }

    public static void sub(double a, double b) {
        double result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    public static void multiply(double a, double b) {
        double result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    public static void add(double a, double b) {
        double result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
}
