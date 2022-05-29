import java.util.Arrays;
import java.util.Scanner;

public class TopIntegeres05 {

    static void loopIfChek () {


    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxInt = Integer.MIN_VALUE;

        for (int elementOfArr : array) {

            if (elementOfArr > maxInt) {

                maxInt = elementOfArr;
            }
        }
        for (int i = 0; i < array.length; i++) {

            if (maxInt == array[array.length - 1]) {

                System.out.printf("%d", maxInt);
                break;
            }

            if (i == array.length - 1) {
                System.out.printf("%d", array[i]);

            } else {
                if (array[i] > array[i + 1]) {
                    System.out.printf("%d ", array[i]);

                }
            }


        }


    }
}
