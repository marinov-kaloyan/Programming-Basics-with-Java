package P02FirstStepsInCodingExercises;

import java.util.Scanner;

public class P05SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int himikali = Integer.parseInt(scanner.nextLine());
        int markeri = Integer.parseInt(scanner.nextLine());
        int litri = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());


        double vsichko = (1 - procent / 100) * (himikali * 5.80 + markeri * 7.20 + litri * 1.20);
        System.out.println(vsichko);
    }
}