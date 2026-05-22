import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade = (marks >= 90) ? "A"
                : (marks >= 80) ? "B"
                : (marks >= 45) ? "C"
                : "Fail";

        System.out.println("Grade: " + grade);
    }
}