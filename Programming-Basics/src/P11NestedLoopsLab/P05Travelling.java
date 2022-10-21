package P11NestedLoopsLab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        while (true) {
            double sum = 0;
            String destination = scanner.nextLine();
            if(destination.equals("End")){break;}
            double cost = Double.parseDouble(scanner.nextLine());



            while (sum < cost) {
                String input = scanner.nextLine();
                if(input.equals("End")){end = true; break;}
                double saved = Double.parseDouble(input);

                sum=sum+saved;

            }
            if (end)break;

            System.out.println("Going to "+destination+"!");
        }


    }
}
