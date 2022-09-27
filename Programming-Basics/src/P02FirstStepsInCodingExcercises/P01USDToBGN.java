package P02FirstStepsInCodingExcercises;

import java.util.Scanner;

public class P01USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double usd = Double.parseDouble(scanner.nextLine());
        Double lv = usd * 1.79549;
        System.out.println(lv);


    }

}
