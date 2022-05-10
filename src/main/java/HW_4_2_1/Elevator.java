package HW_4_2_1;

import java.util.*;

/**
 * @author Dm.Petrov
 * DATE: 07.05.2022
 */
public class Elevator {
    private Queue<Integer> floors = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
    private int waitDoorsInSeconds = 10;
    private int waitMoveInSeconds = 5;
    private int totalSeconds = 0;
    private int previousFloor = -1;

    public void startWorking() {
        while (true) {
            int floor;
            System.out.println("Ожидаю ввода этажа! (Для выхода нажмите 0)");
            try {
                floor = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Не корректные данные!!");
                break;
            }
            if (floor == 0) {
                if (floors.isEmpty()) {
                    System.out.println("Лифт не перемещался");
                    break;
                }
                floors.offer(0);
                Iterator<Integer> iterator = floors.iterator();
                System.out.print("Лифт проследовал по этажам :  ");
                while (iterator.hasNext()) {
                    System.out.print("этаж "+floors.poll());
                    if (iterator.hasNext()) {
                        System.out.print("->");
                    }
                }
                System.out.println();
                System.out.println("Время затраченное лифтом на маршрут = " + totalSeconds + " с.");
                break;
            }
            if (floor > 0 && floor <= 25) {
                if (previousFloor != floor) {
                    floors.offer(floor);
                    if (previousFloor != -1) {
                        totalSeconds += Math.abs(floor - previousFloor) * waitMoveInSeconds;
                        totalSeconds += waitDoorsInSeconds;
                    }
                    previousFloor = floor;
                }
            } else {
                System.out.println("Такого этажа в доме нет !");
            }
        }
    }
}
