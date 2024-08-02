package codsoft;

import java.util.Scanner;

public class task2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of subjects: ");
    int numberOfSubjects = scanner.nextInt();

    int totalMarks = 0;
    for (int i = 0; i < numberOfSubjects; i++) {
      System.out.print("Enter subject name: ");
      String subjectName = scanner.next();

      System.out.print("Enter marks obtained in " + subjectName + " (out of 100): ");
      int marks = scanner.nextInt();

      totalMarks += marks;
    }

    double averagePercentage = (double) totalMarks / numberOfSubjects;
    String grade = calculateGrade(averagePercentage);

    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Percentage: " + averagePercentage + "%");
    System.out.println("Grade: " + grade);

    scanner.close();
  }

  public static String calculateGrade(double averagePercentage) {
    if (averagePercentage >= 90) {
      return "A";
    } else if (averagePercentage >= 80) {
      return "B";
    } else if (averagePercentage >= 70) {
      return "C";
    } else if (averagePercentage >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
}
