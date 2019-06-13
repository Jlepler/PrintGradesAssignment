import java.util.Scanner;

public class PrintGradesAssignment {
    public static void main(String[] args) {

        int testscore;
        String grade = "";
        Scanner keyboard  = new Scanner(System.in);
        String anotherScore;


        do {
            System.out.println("Enter an exam score. ");
            testscore = keyboard.nextInt();
            if ((testscore >= 97) && (testscore <= 100)) {
                grade = "A+";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 94) && (testscore <= 96)) {
                grade = "A";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 90) && (testscore <= 93)) {
                grade = "A-";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 87) && (testscore <= 89)) {
                grade = "B+";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 84) && (testscore <= 86)) {
                grade = "B";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 80) && (testscore <= 83)) {
                grade = "B-";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 77) && (testscore <= 79)) {
                grade = "C+";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 74) && (testscore <= 76)) {
                grade = "C";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 70) && (testscore <= 73)) {
                grade = "C-";
                System.out.println("Good job. Your grade is " + grade);
            } else if ((testscore >= 60) && (testscore <= 69)) {
                grade = "D";
                System.out.println("Good job. Your grade is " + grade);
            } else {
                System.out.println("Go back to School if you get below 60");
            }
            System.out.println("Do you want to enter another score (Y/N)?");
            anotherScore = keyboard.next();
        }
        while (anotherScore.equalsIgnoreCase("Yes"));
        System.out.println("Grade = " + grade);
    }
}
