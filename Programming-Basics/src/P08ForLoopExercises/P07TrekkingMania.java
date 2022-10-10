package P08ForLoopExercises;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int total = 0;
        double g1 = 0;
        double g2 = 0;
        double g3 = 0;
        double g4 = 0;
        double g5 = 0;
        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            total = total + people;
            if(people<=5)g1=g1+people;
            else if (people<=12)g2=g2+people;
            else if (people<=25)g3=g3+people;
            else if (people<=40)g4=g4+people;
            else if (people>40)g5=g5+people;
        }
        System.out.printf("%.2f%%%n",100*g1/total);
        System.out.printf("%.2f%%%n",100*g2/total);
        System.out.printf("%.2f%%%n",100*g3/total);
        System.out.printf("%.2f%%%n",100*g4/total);
        System.out.printf("%.2f%%",100*g5/total);
    }
}
