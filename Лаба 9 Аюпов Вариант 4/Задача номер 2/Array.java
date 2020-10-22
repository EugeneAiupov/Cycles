import java.util.Arrays;


class Array
{
    public static void main( String[] args ) {
        
        int[] arryNum = {1,4,5,6,7,4,9,5,0,2,4};
        System.out.print("\nМассив до реверса:");
        for ( int i = 0; i < arryNum.length; i++){
            System.out.print(arryNum[i] + " ");
        }
        
        
        System.out.print("\nМассив c реверсом:");
        
        for( int i = arryNum.length-1; i >= 0; i--) {
            System.out.print(arryNum[i] + " ");
        }
    }
}