import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPreparationTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("End")) {

            int shotIndex = Integer.parseInt(input);

            if (shotIndex == 0 || shotIndex <= numbers.size() - 1) {
                int valueOfShotTarget = numbers.get(shotIndex);
                numbers.set(shotIndex, -1);
                count++;

                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) != -1) {

                        if (numbers.get(i) > valueOfShotTarget) {
                            numbers.set(i, numbers.get(i) - valueOfShotTarget);

                        } else if (numbers.get(i) <= valueOfShotTarget) {
                            numbers.set(i, numbers.get(i) + valueOfShotTarget);

                        }
                    }

                }


            }


            input = scanner.nextLine();
        }


        System.out.printf("Shot targets: %d -> ", count);
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));

            } else {
                System.out.print(numbers.get(i) + " ");
            }

        }


    }
}
