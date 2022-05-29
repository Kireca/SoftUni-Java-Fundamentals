
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int divider = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }
            if (leftSum == rightSum) {
                flag = true;
                divider = i;
                break;
            }
        }
        if (flag) {
            System.out.println(divider);
        } else {
            System.out.println("no");
        }
    }
}




