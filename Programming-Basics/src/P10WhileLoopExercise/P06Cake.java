package P10WhileLoopExercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int pieces = length*width;
        boolean end=false;
        while(pieces>0){
            String action = scanner.nextLine();
            if (action.equals("STOP")) {end=true;break;
            }
            int piecesTaken = Integer.parseInt(action);
            pieces=pieces-piecesTaken;

        }
        if(end&&pieces>=0){System.out.println(pieces+" pieces are left.");}
        else {System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces));}

    }
}
