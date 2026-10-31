import java.util.Scanner;

public class VotingEligibility {
    public static boolean isEligibleToVote(int age) {
        return age > 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (isEligibleToVote(age)) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote (age must be > 18).");
        }
        sc.close();
    }
}