package P05ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        if (day.equals("Saturday")||day.equals("Sunday")){
            if(fruit.equals("banana")){System.out.printf("%.2f",quantity*2.7);}
            else if (fruit.equals("apple")){System.out.printf("%.2f",quantity*1.25);}
            else if (fruit.equals("orange")){System.out.printf("%.2f",quantity*0.9);}
            else if (fruit.equals("grapefruit")){System.out.printf("%.2f",quantity*1.6);}
            else if (fruit.equals("kiwi")){System.out.printf("%.2f",quantity*3.0);}
            else if (fruit.equals("pineapple")){System.out.printf("%.2f",quantity*5.6);}
            else if (fruit.equals("grapes")){System.out.printf("%.2f",quantity*4.2);}
            else {System.out.println("error");}
        }
        else if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            if(fruit.equals("banana")){System.out.printf("%.2f",quantity*2.5);}
            else if (fruit.equals("apple")){System.out.printf("%.2f",quantity*1.20);}
            else if (fruit.equals("orange")){System.out.printf("%.2f",quantity*0.85);}
            else if (fruit.equals("grapefruit")){System.out.printf("%.2f",quantity*1.45);}
            else if (fruit.equals("kiwi")){System.out.printf("%.2f",quantity*2.7);}
            else if (fruit.equals("pineapple")){System.out.printf("%.2f",quantity*5.5);}
            else if (fruit.equals("grapes")){System.out.printf("%.2f",quantity*3.85);}
            else {System.out.println("error");}
        }
        else {System.out.println("error");}


    }
}
