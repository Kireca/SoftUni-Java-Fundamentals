import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPreparationTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = fillingListFromScanner(scanner, "@");
        String input = scanner.nextLine();

        int place = 0;

        int countHousesDidNot = 0;
        while (!input.equals("Love!")) {

            String[] data = input.split("\\s+");
            int jumpIndex = Integer.parseInt(data[1]);
            place += jumpIndex;


            if (place > numbers.size() - 1) {
                place = 0;
            }
            if (numbers.get(place) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", place);
                input = scanner.nextLine();
                continue;
            }
            numbers.set(place, numbers.get(place) - 2);


            if (numbers.get(place) == 0) {

                System.out.printf("Place %d has Valentine's day.%n", place);
            }


            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            if (number != 0) {
                countHousesDidNot++;
            }

        }

        System.out.printf("Cupid's last position was %d.%n", place);
        int checker = 0;
        for (int i = 0; i < numbers.size(); i++) {
            checker += numbers.get(i);

        }
        if (checker==0){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.", countHousesDidNot);
        }

    }


    public static List<Integer> fillingListFromScanner(Scanner scanner, String splitSymbol) {
        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(splitSymbol))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return numbersList;
    }


}
