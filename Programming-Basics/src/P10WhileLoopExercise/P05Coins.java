package P10WhileLoopExercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  input = Double.parseDouble(scanner.nextLine());
        int count =0;
        int count2leva = 0;
        int count1lev = 0;
        int count50st = 0;
        int count20st=0;
        int count10st = 0;
        int count5st = 0;
        int count2st=0;
        int count1st=0;
        double sum=Math.round(input*100);
        boolean isTrue = false;
        while(sum!=0){

            if(sum/200>=1){sum=sum-200;count++;count2leva++;}
            else if(sum/100>=1){sum=sum-100;count++;count1lev++;}
            else if(sum/50>=1){sum=sum-50;count++;count50st++;}
            else if(sum/20>=1){sum=sum-20;count++;count20st++;}
            else if(sum/10>=1){sum=sum-10;count++;count10st++;}
            else if(sum/5>=1){sum=sum-5;count++;count5st++;}
            else if(sum/2>=1){sum=sum-2;count++;count2st++;}
            else if(sum==1){sum=sum-1;count++;count1st++;}


        }
        System.out.println(count);


    }
}
