package P03ConditionalStatementsLab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        switch (figure) {
            case "square" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double area = a * a;
                System.out.printf("%.3f", area);
                break;
            }
            case "rectangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                double area = a * b;
                System.out.printf("%.3f", area);
                break;
            }
            case "circle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double area = Math.PI * Math.pow(a, 2);
                System.out.printf("%.3f", area);
                break;
            }
            case "triangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                double area = a * b / 2;
                System.out.printf("%.3f", area);
                break;
            }
        }
    }
}
