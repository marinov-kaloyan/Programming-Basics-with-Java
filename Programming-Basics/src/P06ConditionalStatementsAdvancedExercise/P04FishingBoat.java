package P06ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget =Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen= Integer.parseInt(scanner.nextLine());
        double price = 0;

        if(season.equals("Spring")){
            price = 3000;
            if(fishermen%2==0){
                if(fishermen<=6){price=0.85*price;}
                else if(fishermen<=11){price=0.80*price;}
                else if(fishermen>11){price=0.70*price;}
            }
            else {
                if (fishermen <= 6) {
                    price = 0.9 * price;
                } else if (fishermen <= 11) {
                    price = 0.85 * price;
                } else if (fishermen >=12) {
                    price = 0.75 * price;
                }
            }
        }
        else if(season.equals("Summer")){
            price = 4200;
            if(fishermen%2==0){
                if(fishermen<=6){price=0.85*price;}
                else if(fishermen<=11){price=0.80*price;}
                else if(fishermen>=12){price=0.70*price;}
            }
            else {
                if (fishermen <= 6) {
                    price = 0.9 * price;
                } else if (fishermen <= 11) {
                    price = 0.85 * price;
                } else if (fishermen >=12) {
                    price = 0.75 * price;
                }
            }
        }
        else if(season.equals("Autumn")){
            price = 4200;

            if (fishermen <= 6) {
                price = 0.9 * price;
            } else if (fishermen <= 11) {
                price = 0.85 * price;
            } else if (fishermen >=12) {
                price = 0.75 * price;
            }
        }
        else if(season.equals("Winter")){
            price = 2600;
            if(fishermen%2==0){
                if(fishermen<=6){price=0.85*price;}
                else if(fishermen<=11){price=0.80*price;}
                else if(fishermen>=12){price=0.70*price;}
            }
            else {
                if (fishermen <= 6) {
                    price = 0.9 * price;
                } else if (fishermen <= 11) {
                    price = 0.85 * price;
                } else if (fishermen > 12) {
                    price = 0.75 * price;
                }
            }
        }
        if(budget>=price){System.out.printf("Yes! You have %.2f leva left.",budget-price);}
        else{System.out.printf("Not enough money! You need %.2f leva.",Math.abs(budget-price));}






    }
}
