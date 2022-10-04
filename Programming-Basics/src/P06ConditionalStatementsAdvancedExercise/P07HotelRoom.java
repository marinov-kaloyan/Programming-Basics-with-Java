package P06ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double totalPriceStudio = count*studioPrice;
        double apartmentPrice = 0;
        double totalPriceApartment = count*apartmentPrice;

        if(month.equals("May")||month.equals("October")) {
            studioPrice = 50;
            apartmentPrice = 65;
            if(count>7&&count<=14){
                studioPrice = 0.95*studioPrice;
            }
            else if (count>14){studioPrice=0.7*studioPrice;
                apartmentPrice=0.9*apartmentPrice;}

        }

        else if(month.equals("June")||month.equals("September")) {
            studioPrice = 75.2;
            apartmentPrice = 68.70;

            if (count>14){studioPrice=0.8*studioPrice;
                apartmentPrice=0.9*apartmentPrice;}

        }
        else {
            studioPrice = 76;
            apartmentPrice = 77;
            if (count > 14) {
                apartmentPrice = 0.9 * apartmentPrice;
            }

        }


        System.out.printf("Apartment: %.2f lv.",count*apartmentPrice);
        System.out.println();
        System.out.printf("Studio: %.2f lv.",count*studioPrice);



    }
}
