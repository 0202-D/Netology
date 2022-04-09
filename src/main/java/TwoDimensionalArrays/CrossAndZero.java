package TwoDimensionalArrays;

import java.util.ArrayList;


/**
 * @author Dm.Petrov
 * DATE: 08.04.2022
 */
public class CrossAndZero {
    public static int SIZE = 5;
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';
    public static int CHARtoWIN = SIZE;

    public static void main(String[] args) {
        char[][] field = {{'O', 'O', 'O', '-', '-'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'O', 'X'},
                {'X', '-', '-', 'O', '-'},
                {'X', '-', '-', 'O', '-'}};

        char[][] field2 = {{'X', 'O', '-', '-', '-'},
                {'-', 'X', 'O', '-', '-'},
                {'X', '-', 'X', 'O', '-'},
                {'O', 'O', '-', 'X', '-'},
                {'O', '-', '-', 'X', 'X'}};

        char[][] field3 = {
                {'O', 'O', 'O', 'O', 'O'},
                {'X', 'X', 'X', '-', '-'},
                {'X', '-', 'X', 'X', 'X'},
                {'O', '-', '-', '-', 'X'},
                {'O', '-', '-', '-', '-'}};
        char[][] chars = {{'O', '-', '-', '-', 'X'},
                {'O', '-', '-', '-', 'X'},
                {'-', '-', '-', '-', 'X'},
                {'O', '-', '-', '-', '-'},
                {'O', '-', '-', '-', 'X'}};

        ArrayList<char[][]> list = new ArrayList<>();
        list.add(field);
        list.add(field2);
        list.add(field3);
        list.add(chars);
        for (char[][] value : list) {
            System.out.println("Демонстрация");
            printArray(value);
            if (checkWin(value, CROSS)) {
                System.out.println("Выиграли крестики");
            } else if (checkWin(value, ZERO)) {
                System.out.println("Выиграли нолики");
            } else {
                System.out.println("Никто не победил");
            }
            System.out.println("*******************");
        }
    }


    static boolean checkWin(char[][] field, char player) {
        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == player) {
                    sum++;
                } else {
                    sum = 0;
                }
                if (sum == CHARtoWIN) {
                    return true;
                }
            }
            sum = 0;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[j][i] == player) {
                    sum++;
                } else {
                    sum = 0;
                }
                if (sum == CHARtoWIN) {
                    return true;
                }
            }
            sum = 0;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j && field[i][j] == player) {
                    sum++;
                }
                if (i == j && field[i][j] != player) {
                    sum = 0;
                }
            }
            if (sum == CHARtoWIN) {
                return true;
            }

        }
        sum = 0;
        for (int i = 0; i < SIZE; i++) {
            if (field[i][SIZE - 1 - i] == player) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum == CHARtoWIN) {
                return true;
            }
        }
        sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i + 1 == j && field[i][j] == player) {
                    sum++;
                }
                if (i + 1 == j && field[i][j] != player) {
                    sum = 0;
                }
            }
            if (sum == CHARtoWIN) {
                return true;
            }

        }
        sum = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j + 1 && field[i][j] == player) {
                    sum++;
                }
                if (i == j + 1 && field[i][j] != player) {
                    sum = 0;
                }
            }
            if (sum == CHARtoWIN) {
                return true;
            }

        }
        sum = 0;
        for (int i = 0; i < SIZE - 1; i++) {
            if (field[i + 1][SIZE - 1 - i] == player) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum == CHARtoWIN) {
                return true;
            }
        }
        sum = 0;
        for (int i = 1; i < SIZE; i++) {
            if (field[i - 1][SIZE - 1 - i] == player) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum == CHARtoWIN) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(char[][] array) {
        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }
}



