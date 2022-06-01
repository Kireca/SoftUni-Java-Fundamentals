import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());
        TopNumber(line);


        //TODO MAIN CODE !
        System.out.println();
    }

    static void TopNumber(int number) {

        List<Integer> leftDigit = new ArrayList<>();
        List<Integer> rightDigit = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i >= 10 || j >= 10) {
                    break;
                }
                if ((i + j) % 8 == 0 && i % 2 != 0 && j % 2 != 0) {
                    leftDigit.add(i);
                    rightDigit.add(j);
                }
            }


        }


        for (int i = 0; i < leftDigit.size(); i++) {
            System.out.printf("%d%d%n",leftDigit.get(i) , rightDigit.get(i));
        }
    }


}
