package P08ForLoopExercises;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        double tournamentPoints = 0;
        double winCount = 0;
        for (int i = 1; i <= countTournaments; i++) {
            String stage = scanner.nextLine();
            if (stage.equals("W")) {
                tournamentPoints = tournamentPoints + 2000;
                winCount++;
            } if (stage.equals("F")) {tournamentPoints = tournamentPoints + 1200;}
            if (stage.equals("SF")) {tournamentPoints = tournamentPoints + 720;}
        }
        System.out.printf("Final points: %.0f%n",tournamentPoints+startingPoints);
        System.out.printf("Average points: %.0f%n",Math.floor(tournamentPoints/countTournaments));
        System.out.printf("%.2f%%",100*winCount/countTournaments);

    }
}
