import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double factorial = factorialOfNumbs(scanner.nextInt(), scanner.nextInt());

        System.out.printf("%.2f", factorial);
    }


    static double factorialOfNumbs(double firstNum, double secondNum) {

        for (double i = firstNum -1; i > 0; i--) {
            firstNum *= i;
        }
        for (double i = secondNum -1; i > 0; i--) {
            secondNum *= i;
        }

        return firstNum / secondNum;
    }
}
