package HW_4_3_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Dm.Petrov
 * DATE: 10.05.2022
 */
public class Main {
    public static void main(String[] args) {
        Set<Student> setOfStudents = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\" " +
                    "(для завершения работы программы введите \"end\")");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] array = input.split(",");
            if (array.length == 3) {
                Student student = new Student(array);
                if(setOfStudents.contains(student)){
                    System.out.println("Студент с таким уже id существует");
                }
                setOfStudents.add(student);
            } else {
                System.out.println("Не правильный ввод");
            }

        }
        System.out.println("Список студентов:");
        for (Student student : setOfStudents) {
            System.out.println(student);
        }
    }
}
