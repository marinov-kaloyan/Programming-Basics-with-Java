package P05ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        if(city.equals("Sofia")){
            if(sales>=0&&sales<=500){System.out.printf("%.2f",0.05*sales);}
            else if (sales>500&&sales<=1000){System.out.printf("%.2f",0.07*sales);}
            else if (sales>1000&&sales<=10000){System.out.printf("%.2f",0.08*sales);}
            else if (sales>10000){System.out.printf("%.2f",0.12*sales);}
            else {System.out.println("error");

            }}
        else if(city.equals("Varna")){
            if(sales>=0&&sales<=500){System.out.printf("%.2f",0.045*sales);}
            else if (sales>500&&sales<=1000){System.out.printf("%.2f",0.075*sales);}
            else if (sales>1000&&sales<=10000){System.out.printf("%.2f",0.10*sales);}
            else if (sales>10000){System.out.printf("%.2f",0.13*sales);}
            else {System.out.println("error");}}
        else if(city.equals("Plovdiv")){
            if(sales>=0&&sales<=500){System.out.printf("%.2f",0.055*sales);}
            else if (sales>500&&sales<=1000){System.out.printf("%.2f",0.08*sales);}
            else if (sales>1000&&sales<=10000){System.out.printf("%.2f",0.12*sales);}
            else if (sales>10000){System.out.printf("%.2f",0.145*sales);}
            else {System.out.println("error");}}
        else {System.out.println("error");}



    }
}
