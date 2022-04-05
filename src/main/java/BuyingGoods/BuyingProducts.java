package BuyingGoods;

import java.util.Scanner;

/**
 * @author Dm.Petrov
 * DATE: 04.04.2022
 */
public class BuyingProducts {
    private static Scanner sc = new Scanner(System.in);
    private String[] products = {"Сыр", "Мясо", "Творог", "Яйца"};
    private int[] prices = {750, 800, 60, 70};
    private int[] amountOfGoods = new int[products.length];
    int check = 0;

    public void startBuy() {
        System.out.println("Товары доступные для покупки : ");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(i + 1 + "." + products[i] + " " + prices[i] + " руб/упаковка");
        }
        while (true) {
            System.out.println("ВВедите товар и количество , или введите end");
            String s = sc.nextLine();
            if (s.equals("end")) {
                break;
            }
            String[] order = s.split(" ");
            int product = Integer.parseInt(order[0]) - 1;
            int amount = Integer.parseInt(order[1]);
            amountOfGoods[product] += amount;
        }
        System.out.println("Ваша корзина :");
        System.out.println("Наименование товара       Количество       Цена.за уп.      Общая стоимость");
        for (int i = 0; i < prices.length; i++) {
            check += (amountOfGoods[i] * prices[i]);
            if (amountOfGoods[i] != 0) {

                System.out.println(products[i] + "                           " + amountOfGoods[i] + "             " + prices[i] + "                   " + (amountOfGoods[i] * prices[i]));
            }

        }
        System.out.println("Итого : " + check + " руб");
    }

}

