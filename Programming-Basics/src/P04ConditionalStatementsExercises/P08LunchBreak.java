package P04ConditionalStatementsExercises;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double timeEpisode = Double.parseDouble(scanner.nextLine());
        double timeBreak = Double.parseDouble(scanner.nextLine());

        double remainingTime = timeBreak - timeBreak/8 - timeBreak/4;


        if(remainingTime>=timeEpisode){System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",name,Math.ceil(remainingTime-timeEpisode));}
        else{System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",name,Math.ceil(timeEpisode -remainingTime));}




    }
}
