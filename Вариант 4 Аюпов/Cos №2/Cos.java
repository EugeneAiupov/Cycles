import java.util.Scanner;

import javax.print.event.PrintJobListener;
class Cos
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        double sum = 0;
        System.out.println("Введите n: ");
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            sum +=Math.cos(i*x);
        }
        System.out.println("Result:" + sum);

    }
}