package P11NestedLoopsLab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        for(int i = floors;i>=1;i--){
            System.out.println();
            for(int j = 0;j<rooms;j++){
                if(i==floors){System.out.printf("L%d%d ",i,j);}
                if(i<floors&&i%2==0){System.out.printf("O%d%d ",i,j);}
                if(i<floors&&i%2!=0){System.out.printf("A%d%d ",i,j);}
            }
        }


    }
}
