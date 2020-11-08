import java.io.IOException;
import java.util.Scanner;

class Matrix {

    public static void main( String[] argv ) throws IOException {

        int n,k,num;

        Scanner in = new Scanner(System.in);
        

        System.out.print("Enter n: ");
        n = in.nextInt();
        System.out.print("Enter k: ");  
        k = in.nextInt(); 
        num = n;

        int [] [] arr = new int [n] [n];

        for (int i=0; i<arr.length; i++) {
            if(i%2==0) {
                for(int j=0; j<arr.length; j++) {
                    arr[i] [j] = k; k++;
                }
                k=1;
            }
            else {
                for(int j=0; j<arr.length; j++) {
                    arr [i] [j] = num; num--;
                }
                num = n;
            }
        }
        for(int i=0; i<arr.length;i++) {
            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[i] [j] + " ");
            }
            System.out.println();
        }
    }
}