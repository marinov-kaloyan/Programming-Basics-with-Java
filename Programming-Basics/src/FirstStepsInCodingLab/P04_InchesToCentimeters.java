package FirstStepsInCodingLab;

import java.util.Scanner;

public class P04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner (System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double cmToInch = a * 2.54;
        System.out.println(cmToInch);

    }
}
