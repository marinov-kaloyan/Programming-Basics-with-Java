package P02FirstStepsInCodingExcercises.P02.P03;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double suma = Double.parseDouble(scanner.nextLine());
        Double meseci =Double.parseDouble(scanner.nextLine());
        Double lihvenproc = Double.parseDouble(scanner.nextLine());
        Double lihvag = suma*lihvenproc/100;
        Double lihvam = lihvag/12;
        Double sumakr = suma + meseci*lihvam;
        System.out.println(sumakr);

    }
}
