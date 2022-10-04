package P06ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        if(type.equals("Roses")){
            if(count>80){totalPrice=0.9*count*5;}
            else totalPrice = count*5;
        }
        else if(type.equals("Dahlias")){
            if(count>90){totalPrice=0.85*count*3.8;}
            else totalPrice = count*3.8;
        }
        else if(type.equals("Tulips")){
            if(count>80){totalPrice=0.85*count*2.8;}
            else totalPrice = count*2.8;
        }
        else if(type.equals("Narcissus")){
            if(count<120){totalPrice=1.15*count*3;}
            else totalPrice = count*3;
        }
        else if(type.equals("Gladiolus")){
            if(count<80){totalPrice=1.2*count*2.5;}
            else totalPrice = count*2.5;
        }
        if(budget>=totalPrice){System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count,type,budget-totalPrice);}
        else{System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-totalPrice));}


    }
}
