package Exercise;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "someText";


        //TODO BOOLEAN Променлива проверка дали се съдържа в текста !
        text.contains("Text");

        StringBuilder sb = new StringBuilder();

        sb.append("Kireca");
        sb.append(System.lineSeparator());
        sb.append("Music");
        System.out.println(sb);

         sb.insert(8, "Kirilov");
        System.out.println(sb.delete(3,5));


    }
}
