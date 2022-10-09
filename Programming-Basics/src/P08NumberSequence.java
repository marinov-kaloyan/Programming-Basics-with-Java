import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =1; i<=number;i++){
            int a = Integer.parseInt(scanner.nextLine());
            if(a<min)min=a;
            if(a>max)max = a;
        }
        System.out.printf("Max number: %d%n",max);
        System.out.printf("Min number: %d",min);

    }
}
