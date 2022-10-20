package P10WhileLoopExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double neededMoney = Double.parseDouble(scanner.nextLine());
       double moneyNow = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int daysSpend = 0;
        while (moneyNow < neededMoney && daysSpend < 5) {
            String operation = scanner.nextLine();
            double operationAmount = Double.parseDouble(scanner.nextLine());
            days++;
            if(operation.equals("spend")){ moneyNow =moneyNow-operationAmount;
                daysSpend++;
                if(moneyNow<0){moneyNow=0.0;}
            }
            else if (operation.equals("save")){moneyNow=moneyNow+operationAmount;daysSpend=0;}

        }
        if(moneyNow>=neededMoney){System.out.println("You saved the money for "+days+" days.");}
        if(daysSpend==5){System.out.println("You can't save the money.");
            System.out.println(days);}

    }
}
