package HW_4_5_2;

/**
 * @author Dm.Petrov
 * DATE: 12.05.2022
 */
public class Candidate implements Comparable<Candidate> {
    private String fio;
    private String sex;
    private int age;
    private Integer relevance;
    private Integer rating;

    public Candidate(String fio, String sex, int age, Integer relevance, Integer rating) {
        this.fio = fio;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public int compareTo(Candidate o) {
        if (this.relevance - o.relevance < 0) {
            return 1;
        } else if (this.relevance - o.relevance > 0) {
            return -1;
        } else return o.rating - this.rating;
    }

    @Override
    public String toString() {
        return
                fio +
                        ", " + relevance +
                        ", " + rating;

    }
}
