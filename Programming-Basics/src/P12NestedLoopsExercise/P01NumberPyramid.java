package P12NestedLoopsExercise;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = 0;
        int input = Integer.parseInt(scanner.nextLine());
        for (int i =1 ; i<= input; i++) {

            for (int j =1 ; j <=i;j++){
                currentNumber++;
                if(currentNumber>input)break;
                System.out.print(currentNumber+" ");

            }
            if(currentNumber>input)break;
            System.out.println();
        }
    }
}
