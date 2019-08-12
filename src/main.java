import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        sqrt();
        triangle();
        factorial();
    }

    public static int getNumber() {
        System.out.println("insert number");
        System.out.println(">");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        return b;
    }

    public static void sqrt() {
        int num = getNumber();
        double result = getSqrt(num);
        System.out.println("sqrt is " + result);
    }

    private static double getSqrt(int number) {
        return Math.sqrt(number);

    }

    private static void triangle() {
        long num = getNumber();
        long result = getTriangle(num);
        System.out.println("triangle is " + result);
    }

    private static long getTriangle(long number) {
        long result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }

    private static void factorial() {
        long num = getNumber();
        long result = getFactorial(num);
        System.out.println("factorial is " + result);
    }

    private static long getFactorial(long number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
