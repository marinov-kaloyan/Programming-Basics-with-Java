package P04ConditionalStatementsExercises;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int numberPuzzle = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());
        int total = numberBears+numberMinions+numberDolls+numberTrucks+numberPuzzle;
        double totalPrice = numberPuzzle*2.60+numberDolls*3+numberBears*4.10+numberMinions*8.20+numberTrucks*2;
        if(total>=50){
            totalPrice   = totalPrice*0.75;}
        totalPrice=totalPrice*0.9;
        if(totalPrice>=priceExcursion){
            System.out.printf("Yes! %.2f lv left.",totalPrice-priceExcursion);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",priceExcursion-totalPrice );
        }


    }
}
