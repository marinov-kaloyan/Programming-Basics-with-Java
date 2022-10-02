package P05ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city =   scanner.nextLine();
        double quantity  = Double.parseDouble(scanner.nextLine());
        if(city.equals("Sofia")){
            if(product.equals("coffee")){
                System.out.println(0.5*quantity);
            }
            else if (product.equals("water")){
                System.out.println(0.8*quantity);
            }
            else if(product.equals("beer")){
                System.out.println(1.2*quantity);
            }
            else if (product.equals("sweets")){
                System.out.println(1.45*quantity);
            }
            else if (product.equals("peanuts")){
                System.out.println(1.60*quantity);
            }

        }
        if(city.equals("Plovdiv")){
            if(product.equals("coffee")){
                System.out.println(0.4*quantity);
            }
            else if (product.equals("water")){
                System.out.println(0.7*quantity);
            }
            else if(product.equals("beer")){
                System.out.println(1.15*quantity);
            }
            else if (product.equals("sweets")){
                System.out.println(1.30*quantity);
            }
            else if (product.equals("peanuts")){
                System.out.println(1.50*quantity);
            }

        }
        if(city.equals("Varna")){
            if(product.equals("coffee")){
                System.out.println(0.45*quantity);
            }
            else if (product.equals("water")){
                System.out.println(0.7*quantity);
            }
            else if(product.equals("beer")){
                System.out.println(1.1*quantity);
            }
            else if (product.equals("sweets")){
                System.out.println(1.35*quantity);
            }
            else if (product.equals("peanuts")){
                System.out.println(1.55*quantity);
            }

        }

    }
}
