import java.util.Scanner;

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        System.out.println("\n--- Student Report ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
