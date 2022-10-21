package P11NestedLoopsLab;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int validCombinations =0;
        for(int x=0;x<=number;x++){
            for(int y=0;y<=number;y++){
                for(int z = 0; z<=number;z++){
                    if(x+y+z==number)validCombinations++;
                }
            }
        }
        System.out.println(validCombinations);
    }
}
