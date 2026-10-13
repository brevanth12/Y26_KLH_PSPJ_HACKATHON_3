
class Candidate {
    String name;
    int rollNo;
    String position;
    int votes;

    // Default constructor
    Candidate() {
        name = "Unknown";
        rollNo = 0;
        position = "Not Assigned";
        votes = 0;
    }

    // Parameterized constructor
    Candidate(String name, int rollNo, String position, int votes) {
        this.name = name.toUpperCase();
        this.rollNo = rollNo;
        this.position = position.toUpperCase();
        this.votes = votes;
    }

    // Method overloading
    void display() {
        display(true);
    }

    void display(boolean showMessage) {
        if (showMessage) {
            System.out.println("Candidate Registered Successfully");
        }

        System.out.println("Candidate Name     : " + name);
        System.out.println("Roll Number        : " + rollNo);
        System.out.println("Position           : " + position);
        System.out.println("Votes Received     : " + votes);
        System.out.println();
    }

    // Compare candidate names
    boolean isDuplicate(Candidate c) {
        return name.equalsIgnoreCase(c.name);
    }
}

public class StudentCouncilElection {
    public static void main(String[] args) {

        System.out.println("========== STUDENT COUNCIL ELECTION ==========");

        Candidate c1 = new Candidate("Ananya", 101, "President", 125);
        Candidate c2 = new Candidate("Rahul", 102, "President", 98);
        Candidate c3 = new Candidate("Ananya", 103, "President", 50);

        c1.display();
        c2.display();

        System.out.println("Duplicate Candidate Check:");

        if (c1.isDuplicate(c3)) {
            System.out.println("Candidate Name     : " + c3.name);
            System.out.println("Status             : Duplicate Nomination");
        }

        // Find winner
        Candidate winner;

        if (c1.votes > c2.votes) {
            winner = c1;
        } else {
            winner = c2;
        }

        System.out.println("\n---------- ELECTION RESULTS ----------");
        System.out.println("Position           : " + winner.position);
        System.out.println("Winning Candidate  : " + winner.name);
        System.out.println("Total Votes        : " + winner.votes);
        System.out.println("=============================================");
    }
}
