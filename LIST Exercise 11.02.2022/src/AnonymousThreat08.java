import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        while (!line.equals("3:1")) {

            String[] data = line.split("\\s+");
            String command = data[0];

            switch (command) {
                case "merge":
                    List<String> result = new ArrayList<>();
                    int start = Math.max(0, Integer.parseInt(data[1]));
                    int end = Math.min(Integer.parseInt(data[2]), strings.size() - 1);

                    if (start > 0 && start < strings.size()) {

                        //result = strings.subList(0, start);

                        result.addAll(strings.subList(0, start));
                    }

                    if (start < strings.size()) {
                        List<String> mergeElements = strings.subList(start, end + 1);
                        StringBuilder merged = new StringBuilder();
                        for (String mergeElement : mergeElements) {
                            merged.append(mergeElement);
                        }

                        result.add(merged.toString());

                    }
                    if (end + 1 < strings.size()) {
                        result.addAll(strings.subList(end + 1, strings.size()));

                    }
                    if (!result.isEmpty()) {

                        strings = result;
                    }

                    break;

                case "divide":
                    result = new ArrayList<>();
                    int index = Integer.parseInt(data[1]);
                    int parts = Integer.parseInt(data[2]);

                    String element = strings.get(index);

                    int symbols = element.length() / parts;
                    if (element.length() % parts == 0) {

                        for (int i = 0; i < parts; i++) {
                            result.add(element.substring(0, symbols));
                            element = element.substring(symbols);
                        }
                    } else {

                        for (int i = 0; i < parts; i++) {
                            if (i == parts - 1) {
                                result.add(element);

                            } else {

                                result.add(element.substring(0, symbols));
                                element = element.substring(symbols);
                            }
                        }
                    }
                    strings.remove(index);
                    strings.addAll(index, result);

                    break;


            }


            line = scanner.nextLine();
        }

        strings.forEach(s -> System.out.print(s + " "));
    }
}
