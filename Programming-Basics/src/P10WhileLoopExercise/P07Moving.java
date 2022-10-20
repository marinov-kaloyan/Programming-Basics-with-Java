package P10WhileLoopExercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width*length*height;
        boolean done=false;
        while(volume>0){
            String action = scanner.nextLine();
            if(action.equals("Done")){done=true;break;}
            int box=Integer.parseInt(action);
            volume=volume-box;
        }
        if(done&&volume>=0){System.out.printf(volume+ " Cubic meters left.");}
        else{System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(volume));}


    }
}
