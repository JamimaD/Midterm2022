package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        int [] array1 = {30,12,5,9,2,20,33,1};
        int lowest = array1[0];
        for (int i = 0; i < array1.length; i++){
            if(array1[i] < lowest){
                lowest = array1[i];
            }
        }
        System.out.println(lowest);

        int [] array2 = {18,25,41,47,17,36,14,19};
        int lowest2 = array2[0];
        for (int i = 0; i < array2.length; i++){
            if(array2[i] < lowest2){
                lowest2 = array2[i];
            }
        }
        System.out.println(lowest2);

    }

}
