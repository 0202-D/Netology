package Primitive;

import java.util.Scanner;

/**
 * @author Dm.Petrov
 * DATE: 22.03.2022
 */
public class PrivateEntrepreneur {
    public static double taxEarningsMinusSpendings(double earnings, double spendings) {
        double tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            System.out.println("У Вас убытки");
            return 0;
        }
    }

    public static double sixPercentOfIncome(double earlings) {
        if (earlings == 0) {
            System.out.println("У Вас нет доходов");
            return 0;
        }
        return earlings * 6 / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double earnings = 0;
        double spendings = 0;
        int operation = 0;
        while (true) {
            System.out.println("Здравствуте! Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать ситему налогооблажения\n" +
                    "Для выхода введите end ");
            String input = sc.nextLine();
            if (input.equals("end")) {
                System.out.println("Программа завершена");
                break;
            }
            try {
                operation = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Не корректный ввод");
            }

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = sc.nextLine();
                    int moneyIncome = Integer.parseInt(moneyStr);
                    earnings += moneyIncome;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneyStr2 = sc.nextLine();
                    int moneyOutcome = Integer.parseInt(moneyStr2);
                    earnings -= moneyOutcome;
                    break;
                case 3:
                    double result = (taxEarningsMinusSpendings(earnings, spendings) - sixPercentOfIncome(earnings));
                    double result2 = (sixPercentOfIncome(earnings) - taxEarningsMinusSpendings(earnings, spendings));
                    if (sixPercentOfIncome(earnings) == 0 || taxEarningsMinusSpendings(earnings, spendings) == 0) {
                        break;
                    }
                    if (sixPercentOfIncome(earnings) < taxEarningsMinusSpendings(earnings, spendings)) {
                        System.out.println("Мы советуем вам УСН доходы\n" +
                                "Ваш налог составит: " + sixPercentOfIncome(earnings) + " рублей\n" +
                                "Налог на другой системе:" + taxEarningsMinusSpendings(earnings, spendings) + " рублей\n" +
                                "Экономия: ");
                        System.out.printf("%.2f", result);
                        System.out.println();
                        System.out.println("******************************************************");
                        break;
                    }

                    if (sixPercentOfIncome(earnings) > taxEarningsMinusSpendings(earnings, spendings)) {
                        System.out.println("Мы советуем вам УСН доходы минус расходы - налог 15% от разницы доходов и расходов.\n" +
                                "Ваш налог составит: " + taxEarningsMinusSpendings(earnings, spendings) + " рублей\n" +
                                "Налог на другой системе:" + sixPercentOfIncome(earnings) + " рублей\n" +
                                "Экономия: ");
                        System.out.printf("%.2f", result2);
                        System.out.println();
                        System.out.println("********************************************************");
                    } else {
                        System.out.println("Для Вас системы налогообложения равнозначны");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }

        }


    }

}
