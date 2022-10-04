package P06ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days1= Integer.parseInt(scanner.nextLine());
        int days = days1-1;
        String type= scanner.nextLine();
        String apraisal = scanner.nextLine();

        double totalPrice = 0;
        if(type.equals("apartment")){
            if(days<10){totalPrice = 0.7*25*days;}
            else if (days<=15){totalPrice=0.65*25*days;}
            else {totalPrice = 0.5*25*days;}
        }
        else if (type.equals("president apartment")){
            if(days<10){totalPrice = 0.9*35*days;}
            else if (days<=15){totalPrice=0.85*35*days;}
            else {totalPrice = 0.8*35*days;}
        }
        else{totalPrice=18*days;}

        if(apraisal.equals("positive")){
            totalPrice=1.25*totalPrice;
        }
        else if(apraisal.equals("negative")){
            totalPrice=0.9*totalPrice;
        }
        System.out.printf("%.2f",totalPrice);


    }
}
