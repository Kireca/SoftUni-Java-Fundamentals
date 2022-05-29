import java.util.Scanner;

public class WhileTestArray {

    static int getArraySize(int count) {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[getArraySize(1)];


        String input = scanner.nextLine();
        int i = 0;
        while (!input.equals("End")) {
            int intInput = Integer.parseInt(input);


            array[i] = intInput;


            System.out.println(array[i]);
            input = scanner.nextLine();
           if (array.length - 1 <= i) {
               break;
            }
            i++;
        }
    }
}
