package FirstStepsInCodingLab;

import java.util.Scanner;

public class P08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kucheta = Double.parseDouble(scanner.nextLine());
        double kotki = Double.parseDouble(scanner.nextLine());
        Double cenakucheta = kucheta * 2.5;
        Double cenakotki = kotki * 4;
        double suma = cenakotki + cenakucheta;
        System.out.println(suma+" lv.");
    }
}
