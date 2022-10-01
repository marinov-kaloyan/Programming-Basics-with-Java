package P04ConditionalStatementsExercises;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        int totalMin= hour*60+minute+15;

        int newHour = totalMin/60;
        int newMin  =  totalMin%60;


        if(newHour==24){
            newHour=0;
        }
        if(newMin<10) {
            System.out.printf("%d:0%d", newHour, newMin);
        }

        else {System.out.printf("%d:%d", newHour, newMin);}

    }
}
