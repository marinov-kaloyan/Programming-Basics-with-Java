package P05ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        if(product.equals("banana")||product.equals("apple")||product.equals("cherry")||product.equals("kiwi")||product.equals("grapes")||product.equals("lemon")){
            System.out.println("fruit");
        }
        else if (product.equals("tomato")||product.equals("cucumber")||product.equals("pepper")||product.equals("carrot")){System.out.println("vegetable");}
        else {System.out.println("unknown");}

    }
}
