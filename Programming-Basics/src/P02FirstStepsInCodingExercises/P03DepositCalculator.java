package P02FirstStepsInCodingExercises;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double suma = Double.parseDouble(scanner.nextLine());
       double meseci =Double.parseDouble(scanner.nextLine());
       double lihvenproc = Double.parseDouble(scanner.nextLine());
       double lihvag = suma*lihvenproc/100;
       double lihvam = lihvag/12;
       double sumakr = suma + meseci*lihvam;
        System.out.println(sumakr);

    }
}
