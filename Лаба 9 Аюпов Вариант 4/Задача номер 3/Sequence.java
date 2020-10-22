import java.util.Arrays;


class Sequence
{
    public static void main( String[] args ) {
        int arryNum[] = {4,3,5,7,2,3,7,4,3,5,7,2,3,7,4,3,5,7,2,3,7,4,3,5,7,2,3,7,4,3,5,7,2,3,7,4,3,5,7,2,3,7};
        
        Arrays.sort(arryNum);
        
        int index = 0;
        int curnum;
        int count;
        while (index < arryNum.length) {
            
            curnum = arryNum[index];
            
            count = 0;
            
            for(; index < arryNum.length && curnum == arryNum[index]; index++, count++);
            
            System.out.println(curnum + ":" + count);
        }
        
    }
}