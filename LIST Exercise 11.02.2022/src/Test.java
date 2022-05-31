
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();

        String[] array = input.split("\\|");

        List<String> finalArray = new ArrayList<>();

        for (int i = array.length - 1; i >= 0; i--) {
            String[] currentArray = array[i].split("\\s+");
            for (String s : currentArray) {
                if (s.equals("")) {
                    continue;
                }
                finalArray.add(s);

            }
        }

        for (String s : finalArray) {
            System.out.print(s + " ");
        }

    }
}
