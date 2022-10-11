package P09WhileLoopLab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sum = 0;
        int badGrade = 0;
        int count = 1;
        while (count <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.0) {
                sum = sum + grade;
                count++;
            } else {
                badGrade++;
            }
            if (badGrade >= 1) {
                System.out.printf("%s has been excluded at %d grade", name, count); break;
            }
        }
        if(count>12)        System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
    }
}
