package exercise;

import java.util.Scanner;

public class PandawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double saberCount = Math.ceil(students * 1.10);
        int beltsCount = students  - students / 6;

        double totalPrice = saberCount * sabers + robes * students + belts * beltsCount;

       if (money >= totalPrice) {
           System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
       }else {
           System.out.printf("George Lucas will need %.2flv more.",totalPrice - money);

       }





        }



    }

