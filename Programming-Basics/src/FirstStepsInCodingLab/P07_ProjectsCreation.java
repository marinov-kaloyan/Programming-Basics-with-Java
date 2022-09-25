package FirstStepsInCodingLab;

import java.util.Scanner;

public class P07_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectNumber = Integer.parseInt(scanner.nextLine());
        int vreme= projectNumber * 3 ;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name , vreme, projectNumber);
    }
}
