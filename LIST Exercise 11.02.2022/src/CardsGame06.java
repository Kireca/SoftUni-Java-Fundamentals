import java.util.*;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine()
                        .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine()
                        .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());


        int sumFirst = 0;
        int sumSecond = 0;

        while (firstPlayerDeck.size() > 0 && secondPlayerDeck.size() > 0) {

            int firstPlayerCard = firstPlayerDeck.remove(0);
            int secondPlayerCard = secondPlayerDeck.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);

            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerDeck.add(secondPlayerCard);
                secondPlayerDeck.add(firstPlayerCard);

            }

        }
        if (firstPlayerDeck.size() > 0) {
            sumAndPrint(firstPlayerDeck, "First");
        } else if (secondPlayerDeck.size() > 0) {
            sumAndPrint(secondPlayerDeck, "Second");
        }


    }

    private static void sumAndPrint(List<Integer> playerWiner, String player) {
        int sum = 0;
        for (int element : playerWiner)
            sum += element;
        System.out.println(player + " player wins! Sum: " + sum);
    }
}
