import java.util.Scanner;

class Symbols {

     public static void main(String[] args) {
         char [] s = {"*", ";", ":", "."};
         int count = 0;
         Scanner in = new Scanner(System.in);
         String st = in.nextLine();
         for( int i = 0; i < st.length(); i++) {
             for( int j = 0; j < s.length; j++) {
                 if(st.charAt(i)==s[j]){
                     count++;
                     break;
                 }
             }
         }
         System.out.println(count);
        
    }
}