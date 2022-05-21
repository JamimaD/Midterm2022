package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "CAT";
        String str2 = "ACT";

        char char1[] = str1.toCharArray();
        char char2[] = str2.toCharArray();
        if (char1.length != char2.length){
            System.out.println("Not Anagram");
            System.exit(0);
        }

        Arrays.sort(char1);
        Arrays.sort(char2);

        for(int i = 0; i < char1.length; i++){
            if(char1[i] != char2[i]){
                System.out.print("Not Anagram");
                System.exit(0);
            }
        }
        System.out.println("Anagram");
    }
}
