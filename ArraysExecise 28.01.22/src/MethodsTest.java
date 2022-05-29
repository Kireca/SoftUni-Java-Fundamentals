import java.util.Arrays;
import java.util.Scanner;

public class MethodsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 int[] a = Arrays.stream(scanner.nextLine()
                 .split("\\s+"))
                 .mapToInt(value -> Integer.parseInt(value))
                 .toArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
                }

        }
    }
