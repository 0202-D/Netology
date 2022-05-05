package HW_4_1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Dm.Petrov
 * DATE: 03.05.2022
 */
public class NoteBook {
    private List<String> noteBook = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void start() {
        while (true) {
            int choice = 0;
            System.out.println("Выберите действие :");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            do {
                try {
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Не корректный ввод");
                    break;
                }
            }
            while (choice < 0 && choice >= 4);
            if (choice == 0) {
                System.out.println("До свидания !");
                break;
            }
            switch (choice) {
                case (1):
                    addTask();
                    break;
                case (2):
                    printTasks();
                    break;
                case (3):
                    removeTask();
                    break;
        }
    }

}

    public void addTask() {
        System.out.println("Добавьте задачу");
        String task = scanner.next();
        if (!noteBook.contains(task)) {
            noteBook.add(task);
        } else {
            System.out.println("Такая задача уже есть ! Не забудьте ее выполнить!");
        }
        System.out.println("*********************************************************");
    }

    public void printTasks() {
        System.out.println("Ваши задачи : ");
        for (String task : noteBook) {
            System.out.println("* " + task);
        }
        System.out.println("**********************************************************");
    }

    public void removeTask() {
        System.out.println(" Какую задачу хотите удалить ?");
        for (int i = 0; i < noteBook.size(); i++) {
            System.out.println(i + 1 + ". " + noteBook.get(i));
        }
        try {
            int number = scanner.nextInt();
            if (number > 0 && number <= noteBook.size()) {
                noteBook.remove(number - 1);
            } else {
                System.out.println("Не корректный ввод, такой задачи нет!");

            }
        } catch (Exception e) {
        }
        System.out.println("***********************************************************");
    }
}