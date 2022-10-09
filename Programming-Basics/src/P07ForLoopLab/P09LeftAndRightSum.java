package P07ForLoopLab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 1; i <= num; i++) {
            int numLeft = Integer.parseInt(scanner.nextLine());
            sumLeft = sumLeft+numLeft;
        }
        for(int j =num+1;j<=2*num;j++){
            int numRight = Integer.parseInt(scanner.nextLine());
            sumRight=sumRight+numRight;
        }
        if(sumLeft==sumRight){System.out.printf("Yes, sum = %d",sumLeft );}
        else{System.out.println("No, diff = "+Math.abs(sumLeft-sumRight));}

    }
}
