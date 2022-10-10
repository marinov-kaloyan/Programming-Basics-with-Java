package P08ForLoopExercises;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int  sum = 0;
        for(int i =1; i<=count;i++){
            int num = Integer.parseInt(scanner.nextLine());
            sum=sum+num;
            if(num>max)max=num;
        }
        if(max==sum-max){System.out.println("Yes");
            System.out.println("Sum = "+max);}
        else {System.out.println("No");
            System.out.println("Diff = "+Math.abs(max-(sum-max)));}



    }}