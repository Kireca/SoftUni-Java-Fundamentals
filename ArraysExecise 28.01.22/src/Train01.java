
import java.util.Arrays;
import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] train = new int[n];

        for (int i = 0; i < train.length; i++) {
            train[i] = scanner.nextInt();
            System.out.print(train[i] + " ");

        }
        System.out.println();
        System.out.println(Arrays.stream(train).sum());


    }
}
