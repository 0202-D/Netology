package Primitive;

import java.util.Scanner;

/**
 * @author Dm.Petrov
 * DATE: 29.03.2022
 */
public class WorkWithDouble {
    public static void main(String[] args) {
        comparisonWithDouble();

    }
    public static void comparisonWithDouble(){
        Scanner input = new Scanner(System.in);
        int operation=0;
        while (true) {
            System.out.println("Операции над double/float\n" +
                    "1. Сравнить\n" +
                    "2. Округлить\n" +
                    "3. Отбросить дробную часть\n" +
                    "для окончания введите end");
            String in = input.nextLine();
            if (in.equals("end")) {
                System.out.println("Программа завершена");
                break;
            }
            try {
                operation = Integer.parseInt(in);
            } catch (NumberFormatException e) {
                System.out.println("Не корректный ввод");
            }

            switch (operation) {
                case 1:
                    System.out.println("Введите первое число");
                    in = input.nextLine();
                    double d = Double.parseDouble(in);
                    System.out.println("Введите второе число");
                    in = input.nextLine();
                    float f = Float.parseFloat(in);
                    double result = d - (double) f;
                    if (Math.abs(result) < 0.000001) {
                        System.out.println("Чмсла равны");
                        break;
                    }
                    if (result > 0) {
                        System.out.println("Первое число больше");
                        break;
                    }
                    if (result < 0) {
                        System.out.println("Второе число больше");
                        break;
                    }

                case 2:
                    System.out.println("Введите число");
                    in = input.nextLine();
                    double d2 = Double.parseDouble(in);
                    double res = Math.round(d2);
                    System.out.println("Округление : " + res);
                    break;
                case 3:
                    System.out.println("Введите число");
                    in = input.nextLine();
                    double d3 = Double.parseDouble(in);
                    long resultat = (long) d3;
                    System.out.println("Чмсло с отброшенной дробной частью - " + resultat);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }

    }
}
