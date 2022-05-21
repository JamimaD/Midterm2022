package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n = 8;
        int f = 0;
        int s = 1;
        int t;

        System.out.println(f);
        System.out.println(s);
        for (int i = 3; i<=n; i++){
            t = f + s;

            System.out.println(t);

            f = s;
            s = t;
        }
    }
}
