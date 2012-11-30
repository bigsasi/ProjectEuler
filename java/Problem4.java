/* 

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

*/
import java.math.BigInteger;

public class Problem4 {


    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();
        problem4.run();
    }
    
    private int maxfactor = 999;
    private int minfactor = 100;
    
    private int maxsum = maxfactor + maxfactor;
    private int minsum = minfactor + minfactor;
    
    public void run() {
        for (int i = maxsum; i >= minsum; i--) {
            int a = i / 2;
            if (a * 2 != i) a++;
            while (a <= maxfactor) {
                int b = i - a;
                if (b < a/2) break;
                //System.out.println("a: " + a + ", b: " + b + ", a * b = " + (a * b));
                if (isPalindrome(a * b)) {
                    System.out.println("a: " + a + ", b: " + b + ", a * b = " + (a * b));
                    i = 0; 
                    break;
                }
                a++;
            }
        }
    }
    
    private boolean isPalindrome(int i) {
        String s = "" + i;
        String reverse = "";

        
        for (int j = 0; j < s.length(); j++) {
            reverse = s.charAt(j) + reverse;
        }
        
        if (s.compareTo(reverse) == 0) {
            //System.out.println("s: " + s);
            //System.out.println("r: " + reverse);
            return true;
        }
        return false;
    }
}
