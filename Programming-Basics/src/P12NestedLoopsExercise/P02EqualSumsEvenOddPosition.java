package P12NestedLoopsExercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());


        for (int j = first;j  <=last ; j++){
            int currentNum=j;
            int sumeven = 0;
            int sumodd = 0;
            for(int i =6;i>=0;i--){
                int digit = currentNum%10;
                if(i%2==0){sumeven=sumeven+digit;}
                else {sumodd=sumodd+digit;}
                currentNum=currentNum/10;


            }
            if(sumeven==sumodd)System.out.print(j+" ");
        }




    }
}
