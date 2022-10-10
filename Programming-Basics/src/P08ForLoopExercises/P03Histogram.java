package P08ForLoopExercises;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double c1 = 0;
        double c2= 0;
        double c3=0;
        double c4=0;
        double c5=0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if(num<200)c1++;
            else if (num<=399)c2++;
            else if (num<=599)c3++;
            else if (num<=799)c4++;
            else if (num>=800)c5++;
        }

        System.out.printf("%.2f%%%n",100*c1/n);
        System.out.printf("%.2f%%%n",100*c2/n);
        System.out.printf("%.2f%%%n",100*c3/n);
        System.out.printf("%.2f%%%n",100*c4/n);
        System.out.printf("%.2f%%",100*c5/n);

    }
}
