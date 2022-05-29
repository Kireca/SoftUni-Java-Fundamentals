package Exercise;

import java.util.Scanner;

public class MultiplyBigNumber05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());
        // TODO Така не свети!
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        int remainder = 0;
        for (int i = number.length() - 1; i >= 0; i--) {

            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int product = digit * multiplier + remainder;
            if (i == 0) {
                stringBuilder.insert(0, product);

            } else {
                int digitToAdd = product % 10;
                remainder = product / 10;
                stringBuilder.insert(0, digitToAdd);
            }
        }


        while (stringBuilder.charAt(0) == '0' && stringBuilder.length() > 1) {
            stringBuilder.deleteCharAt(0);
        }
        System.out.println(stringBuilder);
    }
}
