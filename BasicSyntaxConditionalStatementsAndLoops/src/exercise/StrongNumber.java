package exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numChar = Integer.parseInt(input);
        int number = numChar;
        int allDigitsFact = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = number % 10;
            number /= 10;
            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }

            allDigitsFact += fact;
        }
        if (numChar == allDigitsFact) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }


}

