import java.util.*;

class Lengh {
    public static void main( String[] args ){
        Random random = new Random();
        int num = random.nextInt(10000);
        String s = "" + num;
        char[] ch = s.toCharArray();
        char[] distinctElements = ch.stream().distinct().collect(Collectors.toCharArray);
        System.out.println(num);
        System.out.println(ch); //не очень понял как выстраить семантику для этого задания??



    }
}