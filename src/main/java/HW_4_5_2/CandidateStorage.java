package HW_4_5_2;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Dm.Petrov
 * DATE: 12.05.2022
 */
public class CandidateStorage {
    private Set<Candidate> storage = new TreeSet<>();

    public void addCandidate(Candidate candidate) {
        storage.add(candidate);
    }

    public void printCandidate() {
        System.out.println("Fio    rel   rat");
        for (Candidate candidate : storage) {
            System.out.println(candidate);
        }
    }

}
