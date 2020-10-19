import java.util.Scanner;
class Number{
    public static void main( String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter natural N: ");
        int n = in.nextInt();
        System.out.print( n + "=" + Integer.toHexString(n)); //16-ричная система счисления
    }
}
