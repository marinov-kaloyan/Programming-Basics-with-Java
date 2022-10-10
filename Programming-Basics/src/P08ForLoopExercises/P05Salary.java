package P08ForLoopExercises;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        for(int i =1 ; i<=tabs||salary<=0;i++){
            String tab = scanner.nextLine();
            if(tab.equals("Facebook"))salary=salary-150;
            else if (tab.equals("Instagram"))salary=salary-100;
            else if (tab.equals("Reddit"))salary=salary-50;
            if(salary<=0){System.out.println("You have lost your salary.");break;}

        }
        if(salary>0) System.out.println(salary);

    }
}
