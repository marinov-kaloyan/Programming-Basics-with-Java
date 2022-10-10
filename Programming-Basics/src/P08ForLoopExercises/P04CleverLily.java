package P08ForLoopExercises;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy= Integer.parseInt(scanner.nextLine());
        int toyCount = 0;
        int totalSaved = 0;
        int evenAge=0;
        for(int i=1;i<=age;i+=2){toyCount++;}
        for(int j=2;j<=age;j+=2){evenAge++;
            totalSaved=totalSaved+evenAge*10;}
        if(totalSaved+toyCount*pricePerToy-evenAge*1>=priceWashMachine){
            System.out.printf("Yes! %.2f",totalSaved+toyCount*pricePerToy-evenAge*1-priceWashMachine );}
        else {System.out.printf("No! %.2f",priceWashMachine-(totalSaved+toyCount*pricePerToy-evenAge*1) );}

    }
}
