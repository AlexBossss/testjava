import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
 Program program = new Program();
 program.runProgram();

    }

    private static List<String> getDataNumber(String[] messages) {
        List<String> Operands = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < messages.length; index++) {

            System.out.println(messages[index]);

            Operands.add(getOneNumber(scanner));
        }
        return Operands;
    }

    private static String getOneNumber(Scanner scanner) {
        try {
            System.out.println(">");
            return scanner.nextLine();
        } catch (Exception exception) {
            System.out.println("mistake");
            scanner.next();
            return getOneNumber(scanner);
        }
    }

    private static void sum() {
        String[] messages = {"insert first", "insert second number"};
        List<String> num = getDataNumber(messages);
        double firstNumber = Double.parseDouble(num.get(0));
        double secondNumber = Double.parseDouble(num.get(1));
        double result = getSum(firstNumber, secondNumber);
        System.out.println("sum is " + result);
    }

    private static double getSum(double firstOperand, double secondOperant) {
        return firstOperand + secondOperant;
    }

}




