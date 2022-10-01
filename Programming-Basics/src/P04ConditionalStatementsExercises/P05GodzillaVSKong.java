package P04ConditionalStatementsExercises;

import java.util.Scanner;

public class P05GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        if(statists>150){
            clothesPrice=0.9*clothesPrice;
        }
        double remainingBudget = 0.1*budget+clothesPrice*statists;
        if(remainingBudget<=budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - remainingBudget);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget-remainingBudget));}




    }
}
