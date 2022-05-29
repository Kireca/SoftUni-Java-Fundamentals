import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split("\\s+");
        String[] secondArray = scanner.nextLine().split("\\s+");


       for (String secondElement : secondArray) {
           for (String firstElement : firstArray) {
               if (secondElement.equals(firstElement)){
                   System.out.print(firstElement + " ");
               }
           }
       }














    }
}
