package P02FirstStepsInCodingExcercises;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nailon = Integer.parseInt(scanner.nextLine());
        int boq =Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int chasove = Integer.parseInt(scanner.nextLine());
        double suma =    (nailon+2)*1.50 + (boq*1.1)*14.50 + razreditel*5+ 0.40+ ((nailon+2)*1.50 + boq*1.1*14.50 + razreditel*5+ 0.40)*0.3*chasove;
        System.out.println(suma);
    }
}
