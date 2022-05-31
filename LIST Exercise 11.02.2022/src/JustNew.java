
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JustNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = fillingListFromScanner(scanner , "@+");




        printList(numbers, " ");


    }

    public static void printList(List<Integer> numbers, String symbol) {

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));

            } else {
                System.out.print(numbers.get(i) + symbol);
            }

        }
    }


    public static void printList(List<Integer> numbers) {

        System.out.print(numbers);

    }


    public static List<Integer> fillingListFromScanner(Scanner scanner , String symbol) {
        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(symbol))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return numbersList;
    }


}
