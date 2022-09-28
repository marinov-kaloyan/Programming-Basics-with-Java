package P02FirstStepsInCodingExcercises;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double pile = Double.parseDouble(scanner.nextLine());
       double riba = Double.parseDouble(scanner.nextLine());
       double vegy = Double.parseDouble(scanner.nextLine());
        double suma = (pile*10.35+ riba*12.40 + vegy*8.15)*1.2 + 2.50;
        System.out.println(suma);
    }
}
