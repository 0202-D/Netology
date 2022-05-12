package HW_4_3_2;

import java.util.Objects;

/**
 * @author Dm.Petrov
 * DATE: 10.05.2022
 */
public class Student {
    private String name;
    private String group;
    private int id;

    public Student(String[] array) {
            this.name = array[0];
            this.group = array[1];
            this.id = Integer.parseInt(array[2]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "- " + name + ", " + group + ", " + id;
    }
}
