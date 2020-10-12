import java.util.Scanner;


class Delete{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        int b = 0;
        System.out.println("Enter number: ");
        double x = in.nextDouble();
        System.out.println("Enter number of digits to delete: ");
        int n = in.nextInt();
        while(x){
            if(x%10!=n){
                b = b*10+x%10;
                b/=10;

            }
        }
        while(b){
            x=x*10+b%10;
            b/=10;
        }
        System.out.println(x);


    }
}