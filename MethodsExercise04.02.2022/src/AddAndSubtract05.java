import java.util.Scanner;

public class AddAndSubtract05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int i = SumOfIntegers(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println(i);
    }

    static int SumOfIntegers(int a, int b, int c) {


        return a + b - c;
    }
}
