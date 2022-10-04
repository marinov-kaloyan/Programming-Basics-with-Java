package P06ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourStart = Integer.parseInt(scanner.nextLine());
        int minuteStart = Integer.parseInt(scanner.nextLine());
        int hourArr = Integer.parseInt(scanner.nextLine());
        int minuteArr = Integer.parseInt(scanner.nextLine());
        int totalMinStart = hourStart * 60 + minuteStart;
        int totalMinArr = hourArr * 60 + minuteArr;
        int timediff = totalMinStart - totalMinArr;
        if (totalMinStart < totalMinArr) {
            System.out.println("Late");
        } else if (totalMinStart >= totalMinArr&&timediff <= 30) {
            System.out.println("On time");
        } else if (timediff>30){
            System.out.println("Early");
        }
        if (totalMinStart > totalMinArr) {
            if (totalMinStart - totalMinArr >= 60) {
                int hrsBefore = (totalMinStart - totalMinArr) / 60;
                int minBefore = (totalMinStart - totalMinArr) % 60;
                if (minBefore < 10) {
                    System.out.printf("%d:0%d hours before the start", hrsBefore, minBefore);
                } else {
                    System.out.printf("%d:%d hours before the start", hrsBefore, minBefore);
                }
            } else {
                int minBefore = (totalMinStart - totalMinArr) % 60;
                System.out.printf("%d minutes before the start", minBefore);
            }}
        else if (totalMinStart < totalMinArr) {
            if (totalMinArr - totalMinStart >= 60) {
                int hrsAfter = (totalMinArr- totalMinStart) / 60;
                int minAfter = (totalMinArr- totalMinStart) % 60;
                if (minAfter < 10) {
                    System.out.printf("%d:0%d hours after the start", hrsAfter, minAfter);
                } else {
                    System.out.printf("%d:%d hours after the start", hrsAfter, minAfter);
                }
            } else {
                int minBefore = (totalMinArr-totalMinStart) % 60;
                System.out.printf("%d minutes after the start", minBefore);
            }


        }
    }

}
