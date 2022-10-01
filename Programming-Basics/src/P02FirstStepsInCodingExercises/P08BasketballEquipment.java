package P02FirstStepsInCodingExercises;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double   taksa =Double.parseDouble(scanner.nextLine());
        double kecove = 0.6*taksa;
        double ekip = 0.8*kecove;
        double topka = 0.25* ekip;
        double aksesoari = topka*0.2;
        double suma = taksa + kecove + ekip + topka + aksesoari;
        System.out.println(suma);
    }
}
