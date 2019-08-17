import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {


    public static void runProgram() {
        boolean work = true;
        List<String> numbers = new ArrayList<>();
        while (work) {
            String data = getData();

            numbers.add(data);

            if (data.equals("exit")) {
                System.out.println("good bye");
                work = false;
                showResult(numbers);
            }
        }
    }

    public static String getData() {
        System.out.println("insert number");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value;
    }


    public static void showResult(List<String> array) {
        long result = 0;
        for (int index = 0; index < array.size() - 1; index++) {
            long number = Long.parseLong(array.get(index));
            result += number;
        }
        System.out.println(result);
    }


}
