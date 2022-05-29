
import java.util.Scanner;

public class KaminoFactory09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        int bestDnaPosition = 0;
        int maxLength = 0;
        int maxSumElements = 0;
        String bestLocalDna = "";
        int countDna = 0;
        int bestCountDna = 0;
        String[] bestDNA = new String[n];

        while (!line.equals("Clone them!")) {
            countDna++;

            String data = line.replaceAll("!", "");
            String[] dna = data.split("0");
            int currentLength = 0;
            int currentSumElements = 0;
            int currentPosition = 0;
            for (String s : dna) {
                currentSumElements += s.length();
                if (s.length() > currentLength) {
                    currentLength = s.length();
                    bestLocalDna = s;

                }
            }
            currentPosition = data.indexOf(bestLocalDna);

            if (currentLength > maxLength){
                maxLength = currentLength;
                maxSumElements = currentSumElements;
                bestDnaPosition = currentPosition;
                bestCountDna = countDna;
                bestDNA = data.split("");

            }else if (currentLength == maxLength && (bestDnaPosition > currentPosition || currentSumElements > maxSumElements)){

                maxSumElements = currentSumElements;
                bestDnaPosition = currentPosition;
                bestCountDna = countDna;
                bestDNA = data.split("");

            }else if (countDna == 1){
                maxLength = currentLength;
                maxSumElements = currentSumElements;
                bestDnaPosition = currentPosition;
                bestCountDna = countDna;
                bestDNA = data.split("");
            }


            line = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCountDna,maxSumElements);
        System.out.println(String.join(" ", bestDNA));
    }
}




