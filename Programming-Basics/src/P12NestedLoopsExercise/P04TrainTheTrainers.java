package P12NestedLoopsExercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double total = 0;
        double overall = 0;
        int counter = 0;
        while (!name.equals("Finish")) {


            total = 0;
            for (int i = 1; i <= jury; i++) {
                double score = Double.parseDouble(scanner.nextLine());

                counter++;
                total = total + score;
                overall = overall + score;
            }
            System.out.printf("%s - %.2f.%n", name, total / jury);
            name = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", overall / counter);
    }
}
