package LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StringBuiilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "the quick brown fox jumps over the lazy dog";

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            s.append(i);

        }

        // TODO SPLIT algorithm!

        char separator = ' ';
        StringBuilder current = new StringBuilder();
        List<String> split = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != separator) {
                current.append(text.charAt(i));

            } else {
                split.add(current.toString());
                //TODO изчистване на СтрингБилдера !
                current.setLength(0);
            }
        }


    }
}
