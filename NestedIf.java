public class NestedIf {
    public static void main(String[] args) {
        int age = 20;
        boolean hasVoterID = true;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("Person is eligible to vote");
            } else {
                System.out.println("Person is not eligible to vote without Voter ID");
            }
        } else {
            System.out.println("Person is not eligible to vote due to age");
        }
    }
}

/*
 Person is eligible to vote
*/