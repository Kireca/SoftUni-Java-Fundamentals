import java.util.Scanner;

public class Task05fromColeg {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] numbersAsString = input.split("\\s+");


    int[] numbers = new int[numbersAsString.length];

    for (int i = 0; i < numbersAsString.length; i++) {
        numbers[i] = Integer.parseInt(numbersAsString[i]);
    }

    for (int i = 0; i < numbers.length; i++) {
        boolean isBigger = true;

        for (int rightNumbers = i + 1; rightNumbers < numbers.length; rightNumbers++) {

            if (numbers[i] <= numbers[rightNumbers]) {
                isBigger = false;
                break;
            }

        }

        if (isBigger) {
            System.out.print(numbers[i] + " ");
        }

    }

}
}


