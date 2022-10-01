package P04ConditionalStatementsExercises;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double wr = Double.parseDouble(scanner.nextLine());
       double distance = Double.parseDouble(scanner.nextLine());
       double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double totalTime = distance*secondsPerMeter;
        double addTime = Math.floor(distance/15)*12.5;
        double totalTime1 = totalTime + addTime;
        if(wr>totalTime1){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime1);
        }else System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime1-wr);






    }
}
