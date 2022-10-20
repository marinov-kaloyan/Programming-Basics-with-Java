package P10WhileLoopExercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        String firstBook = scanner.nextLine();
        int count =0;
        boolean isFound = false;
        while (!firstBook.equals("No More Books")){
            if(firstBook.equals(bookName)){isFound= true;break;}
            count ++;
            firstBook=scanner.nextLine();
        }
        if(!isFound){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",count);}
        else{System.out.printf("You checked %d books and found it.",count);}


    }
}
