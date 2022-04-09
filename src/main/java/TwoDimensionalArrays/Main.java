package TwoDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Dm.Petrov
 * DATE: 07.04.2022
 */
public class Main {
    static int SIZE = 8;
    static int[][] colors = new int[SIZE][SIZE];
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        printArray(colors);
        System.out.println();
        int[][] rotatedColors;
        System.out.println("Веедите угол поворота кратный 90 градусов");
        int read = in.nextInt();
        switch (read) {
            case 90:
                rotatedColors = turnArray(colors);
                printArray(rotatedColors);
                break;
            case 180:
                rotatedColors = turnArray(turnArray(colors));
                printArray(rotatedColors);
                break;
            case 270:
                rotatedColors = turnArray(turnArray(turnArray(colors)));
                printArray(rotatedColors);
        }

    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] turnArray(int[][] arr) {

        int[][] result = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    result[i][arr.length - 1 - j] = arr[j][i];
                }
        }
        return result;
    }

}
