import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

           sqrt();
//           triangle();
//           factorial();
//        getNumber("two");

    }

    private static ArrayList getDataNumber(int amount, String message) {
        ArrayList Operands = new ArrayList();
        System.out.println(message);
        for (int index = 0; index < amount; index++) {
            Operands.add(getOneNumber());

        }
        return Operands;
    }

    private static int getOneNumber() {
        try {
//            System.out.println("insert number");
            System.out.println(">");
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();

            return b;
        } catch (Exception exception) {
            System.out.println("mistake");
            return getOneNumber();
        }
    }


    public static void sqrt() {
        ArrayList num = getDataNumber(1, "insert one number");
        int number = (int) num.get(0);
        double result = getSqrt(number);
        System.out.println("sqrt is " + result);
    }

    private static double getSqrt(int number) {
        return Math.sqrt(number);

    }
}




