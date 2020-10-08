import java.util.Scanner;

class Steps
{
    public static void main (String[] args) {
        double fx;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало отрезка:");
        int a = in.nextInt();
        System.out.println("Введите конец отрезка:");
        int b = in.nextInt();
        System.out.println("Введите длину шага:");
        int h = in.nextInt();
        System.out.println("F(x)=tg(x)");
        for (int i = a; i <= b; i += h ) {
            double x = i;
            fx = Math.tan(x);
            System.out.println("fx=" + fx + "\ti=" + i) ;
            
            
        }



        
    }
}