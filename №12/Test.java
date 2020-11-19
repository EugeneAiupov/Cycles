
class Test {

    public static void main( String args[] ) {

        
        System.out.print("Text: ");
        String str = "beautifull.text.yoors.apple.sey.sad";
        str = str.replaceAll("[.]", "");
        char[] carray = str.toCharArray();

        System.out.print("Duplicate is: ");
        for (int i = 0; i < str.length(); i++ ){
            for (int j = i + 1; j < str.length(); j++) {
                if(carray [i] == carray [j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}