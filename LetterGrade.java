import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        String letterGrade;
        System.out.println("Please enter your grade:");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        if (grade >= 90) {
            letterGrade = "A";
            if (grade >= 97) {
                letterGrade += "+";
            }
        } else if (grade >= 80) {
            letterGrade = "B";
            if (grade >= 87) {
                letterGrade += "+";
            }
        } else if (grade >= 70) {
            letterGrade = "C";
            if (grade >= 77) {
                letterGrade += "+";
            }
        } else if (grade >= 60) {
            letterGrade = "D";
            if (grade >= 67) {
                letterGrade += "+";
            }
        } else {
            letterGrade = "F";
        }

        System.out.println("Your Grade is : " + letterGrade);
    }
}
