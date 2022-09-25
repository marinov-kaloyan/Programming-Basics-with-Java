package FirstStepsInCodingLab;

import java.util.Scanner;

public class P09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double dvor = Double.parseDouble(scanner.nextLine());
        Double cenab = dvor * 7.61;
        Double cenas = cenab*0.82;
        Double ots = cenab*0.18;
        System.out.println("The final price is: "+cenas+" lv.");
        System.out.println("The discount is: "+ots+" lv.");
    }
}
