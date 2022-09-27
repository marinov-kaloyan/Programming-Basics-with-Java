package P01FirstStepsInCodingLab;

import java.util.Scanner;

public class P06_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String FirstName = scanner.nextLine();
        String SecondName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine()  );
        String town =scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",FirstName, SecondName,age ,town);
    }
}
