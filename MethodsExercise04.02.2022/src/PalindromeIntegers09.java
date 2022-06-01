
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();


        while (!line.equals("END")) {
            palindrome(line);


            line = scanner.nextLine();
        }

    }


    static void palindrome(String number) {
        List<Character> symbols = new ArrayList<>();
        List<Character> reverseSymbols = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            symbols.add(number.charAt(i));

        }
        for (int i = number.length(); i > 0; i--) {
            reverseSymbols.add(number.charAt(i - 1));

        }
        int counter = 0;
        for (int i = 0; i < number.length(); i++) {
            if (symbols.get(i).equals(reverseSymbols.get(i))) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter == number.length()) {
                System.out.println("true");
            }


        }
        if (counter == 0) {
            System.out.println("false");
        }

    }

}
