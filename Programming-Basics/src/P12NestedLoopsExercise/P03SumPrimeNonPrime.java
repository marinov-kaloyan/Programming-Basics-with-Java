package P12NestedLoopsExercise;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int nonPrimesSum = 0;
        int primeSum = 0;
        while (!input.equals("stop")) {

            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    nonPrimesSum = nonPrimesSum + number;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeSum = primeSum + number;
            }
            input = scanner.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimesSum);


    }
}
