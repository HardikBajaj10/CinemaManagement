import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        double average = totalMarks / 5.0;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Student Report ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
