package P06ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int  row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        if (type.equals("Premiere")){System.out.printf("%.2f leva",row*col*12.00);}
        else if (type.equals("Normal")){System.out.printf("%.2f leva",row*col*7.50);}
        else if (type.equals("Discount")){System.out.printf("%.2f leva",row*col*5.0);}


    }
}
