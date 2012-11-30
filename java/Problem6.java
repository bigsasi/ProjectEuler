/* 

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

*/
import java.math.BigInteger;

public class Problem6 {


    public static void main(String[] args) {
        Problem6 problem6 = new Problem6();
        problem6.run();
    }
    
    private int min = 1;
    private int max = 100;
    
    public void run() {
        long sum = 0;
        for (int i = min; i <= max; i++) {
            sum += (long) i;
        }
        sum = sum * sum;
        System.out.println("(Sum i = " + min + ".." + max + ") ^ 2 = " + sum);
        
        long sum2 = 0;
        for (int i = min; i <= max; i++) {
            sum2 += (long) (i * i);
        }
        System.out.println("Sum (i = " + min + ".." + max + " ^ 2) = " + sum2);
    }
}
