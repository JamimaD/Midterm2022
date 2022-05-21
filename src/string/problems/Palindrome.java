package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String x = "MOM";
        int i = 0, j = x.length()-1;

        while(i<j) {
            if (x.charAt(i) != x.charAt(j)) {
                System.out.println("Not Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
