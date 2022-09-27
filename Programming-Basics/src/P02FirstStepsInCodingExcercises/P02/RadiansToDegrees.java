package P02FirstStepsInCodingExcercises.P02;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double rad = Double.parseDouble(scanner.nextLine());
        Double deg = rad *180/ Math.PI;
        System.out.println(deg);
    }
}
