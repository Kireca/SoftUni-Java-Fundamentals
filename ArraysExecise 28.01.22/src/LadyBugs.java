import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] bugPositions = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] field = new int[fieldSize];

        for (int index : bugPositions) {
            if (index >= 0 && index < field.length) {
                field[index] = 1;
            }
        }  
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] data = command.split("\\s+");

            int index = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);

            if (index < 0 || index >= field.length || field[index] != 1) {
                command = scanner.nextLine();
                continue;
            }
            field[index] = 0;
            switch (direction) {
                case "right":
                    index += flyLength;
                    while (index < fieldSize && field[index] == 1) {
                        index += flyLength;
                    }
                    if (index < fieldSize) {
                        field[index] = 1;
                    }
                    break;
                case "left":
                    index -= flyLength;
                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;

                    }
                    break;

            }

            command = scanner.nextLine();
        }

        Arrays.stream(field).forEach(value -> System.out.print(value + " "));

    }
}
