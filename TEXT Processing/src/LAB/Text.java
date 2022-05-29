package LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s");
        List<String> repeated = new ArrayList<>();
        for (String word : words) {
            repeated.add(repeat(word, word.length()));
        }


    }

    //TODO:  Метод за повтаряне на стрингове по тяхната дължина.. например : "abc" = "abcabcabc"
    private static String repeat(String word, int repetitions) {
        char[] repeated = new char[word.length() * repetitions];

        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());

        }
        return new String(repeated);
    }
}
