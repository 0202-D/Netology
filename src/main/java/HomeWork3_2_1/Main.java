package HomeWork3_2_1;

import java.util.Scanner;

/**
 * @author Dm.Petrov
 * DATE: 14.04.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        while (true) {
            System.out.println("Введите номер слота");
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }

        System.out.println("Game over!");
    }
}
