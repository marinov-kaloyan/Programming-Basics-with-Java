package P04ConditionalStatementsExercises;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double totalPrice = video*250+ cpu*0.35*(video*250)+ram*0.1*(video*250);
        if(video>cpu){totalPrice=totalPrice*0.85;}

        if(budget>=totalPrice){System.out.printf("You have %.2f leva left!",budget-totalPrice);
        }
        else{System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(budget-totalPrice));
        }




    }
}
