
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class AppendArrays07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");


        List<String> numbers = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] array = input[i].split("\\s+");
            for (String s : array) {
                if (s.equals("")) {
                    continue;
                }
                numbers.add(s);
            }


        }
        for (String s : numbers) {
            System.out.print(s + " ");
        }
    }
}


