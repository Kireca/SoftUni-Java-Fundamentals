package exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вашата задача е да изчислите общата цена на покупка от автомат.
        // Докато не получите "Старт", ще ви бъдат дадени различни монети,
        // които се поставят в машината. Трябва да ги сумирате, за да вкарате общите пари.
        // Все пак има проблем. Вашият автомат работи само с 0,10, 0,20, 0,50, 1 и 2 монети.
        // Ако някой се опита да вмъкне други монети, трябва да изведете "Cannot accept {money}",
        // където стойността се форматира във втората цифра след десетичната запетая и не се добавя към общите пари.
        // На следващите няколко реда, докато не получите "Край", ще ви бъдат дадени продукти за закупуване.
        // Вашата машина обаче има само "Ядки", "Вода", "Чипсове", "Сода", "Кола".
        // Цените са съответно: 2.0, 0.7, 1.5, 0.8, 1.0. Ако лицето се опита да закупи несъществуващ продукт,
        // отпечатайте „Невалиден продукт“. Внимавайте човекът да се опита да закупи продукт, за който няма пари.
        // В такъв случай отпечатайте „Съжаляваме, няма достатъчно пари“.
        // Ако лицето закупи продукт успешно, отпечатайте „Purchased {product name}“. След командата „Край“ отпечатайте парите,
        // които са останали форматирани до втората десетична запетая във формат „Промяна: {пари останаха}“.
        String input = scanner.nextLine();


        double putInMachineMoney = 0.0;
        double price = 0;

        while (!input.equals("Start")) {
            double inputCoins = Double.parseDouble(input);

            if (inputCoins != 0.1 && inputCoins != 0.2 && inputCoins != 0.5 && inputCoins != 1.0 && inputCoins != 2.0) {
                System.out.printf("Cannot accept %.2f%n", inputCoins);
                inputCoins = 0.0;
            }


            putInMachineMoney += inputCoins;
            input = scanner.nextLine();

        }
        input = scanner.nextLine();

        while (!input.equals("End")) {


            switch (input) {

                case "Nuts":
                    price = 2.0;
                    if (putInMachineMoney >= price) {
                        System.out.println("Purchased Nuts");
                        putInMachineMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Water":
                    price = 0.7;
                    if (putInMachineMoney >= price) {
                        putInMachineMoney -= price;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Crisps":
                    price = 1.5;
                    if (putInMachineMoney >= price) {
                        System.out.println("Purchased Crisps");
                        putInMachineMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Soda":
                    price = 0.8;
                    if (putInMachineMoney >= price) {
                        System.out.println("Purchased Soda");
                        putInMachineMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Coke":
                    price = 1.0;
                    if (putInMachineMoney >= price) {
                        System.out.println("Purchased Coke");
                        putInMachineMoney -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                default:
                    System.out.println("Invalid product");

            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", putInMachineMoney);


    }


}



