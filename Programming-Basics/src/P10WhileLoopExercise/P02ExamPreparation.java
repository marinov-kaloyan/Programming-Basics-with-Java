package P10WhileLoopExercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public class ExamPreparation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int badGrade = Integer.parseInt(scanner.nextLine());
            String taskName = scanner.nextLine();
            double total = 0;
            int counter = 0;
            int badGradeCounter = 0;
            boolean equal = false;
            String lastProblem = "";

            while(!taskName.equals("Enough")){
                int grade =Integer.parseInt(scanner.nextLine());
                total = total+grade;
                lastProblem=taskName;
                if(grade<=4){badGradeCounter++;}
                if(badGradeCounter==badGrade){equal=true;break;}
                taskName= scanner.nextLine();
                counter++;


            }
            if(equal){System.out.println("You need a break, "+badGradeCounter+" poor grades.");}
            else{System.out.printf("Average score: %.2f%n",total/counter);
                System.out.println("Number of problems: "+ counter);
                System.out.println("Last problem: "+lastProblem);}




        }
}
