package P07ForLoopLab;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i =1; i<=number;i++){
            int a = Integer.parseInt(scanner.nextLine());
            sum = sum+a;
        }
        System.out.println(sum);
    }
}
