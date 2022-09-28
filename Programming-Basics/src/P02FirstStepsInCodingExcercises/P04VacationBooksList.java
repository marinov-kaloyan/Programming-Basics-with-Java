package P02FirstStepsInCodingExcercises;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broistranici = Integer.parseInt(scanner.nextLine());
        int strani = Integer.parseInt(scanner.nextLine());
        int dni = Integer.parseInt(scanner.nextLine());
        int chasove = broistranici/strani;
        int chasovenaden = chasove/dni;
        System.out.println(chasovenaden);

    }
}
