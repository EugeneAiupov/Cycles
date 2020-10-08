import java.util.Scanner;

class Steps
{
    public static void main( String[] args ) {
        double y,z,u;
        
        Scanner in = new Scanner (System.in);
        System.out.print( "Enter x: " );
        double x = in.nextDouble();
        System.out.print( "Enter h: " );
        double h = in.nextDouble();
        for ( y = 2; y < 3; y+=h ) {
            z = Math.sqrt(x*x-y*y);
            u = Math.asin(z/y) * 180/Math.PI;
            System.out.println( "The angle is: " + u); // почему возвращается NaN. Я гуглил и ничего не нашел!
        }

    }
}