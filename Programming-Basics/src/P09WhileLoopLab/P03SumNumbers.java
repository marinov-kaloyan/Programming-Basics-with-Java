package P09WhileLoopLab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum<input){
            int   input1= Integer.parseInt(scanner.nextLine());
            sum =sum +input1;

        }
        System.out.println(sum);
    }
}
