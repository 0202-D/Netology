package HW_4_5_2;

/**
 * @author Dm.Petrov
 * DATE: 12.05.2022
 */
public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("Ivanov", "m", 30, 4, 6);
        Candidate candidate2 = new Candidate("Petrov", "m", 18, 4, 5);
        Candidate candidate3 = new Candidate("Sidorov", "m", 44, 5, 8);
        Candidate candidate4 = new Candidate("Smirnov", "m", 45, 3, 9);
        Candidate candidate5 = new Candidate("Nikolaev", "m", 22, 2, 6);
        Candidate candidate6 = new Candidate("Babajan", "m", 21, 4, 9);
        Candidate candidate7 = new Candidate("Shumeiko", "m", 25, 5, 5);
        Candidate candidate8 = new Candidate("Kiknadze", "m", 30, 4, 6);
        Candidate candidate9 = new Candidate("Osipov", "m", 31, 3, 6);
        Candidate candidate10 = new Candidate("Marks", "m", 37, 0, 6);
        Candidate candidate11 = new Candidate("Suvorov", "m", 30, 1, 1);
        CandidateStorage candidateStorage = new CandidateStorage();
        candidateStorage.addCandidate(candidate1);
        candidateStorage.addCandidate(candidate2);
        candidateStorage.addCandidate(candidate3);
        candidateStorage.addCandidate(candidate4);
        candidateStorage.addCandidate(candidate5);
        candidateStorage.addCandidate(candidate6);
        candidateStorage.addCandidate(candidate7);
        candidateStorage.addCandidate(candidate8);
        candidateStorage.addCandidate(candidate9);
        candidateStorage.addCandidate(candidate10);
        candidateStorage.addCandidate(candidate11);
        candidateStorage.printCandidate();
    }
}
