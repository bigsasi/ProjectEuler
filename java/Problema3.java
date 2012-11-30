/* 

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

*/
import java.math.BigInteger;

public class Problema3 {


    public static void main(String[] args) {
        Problema3 problema3 = new Problema3();
        problema3.run();
    }
    
    public void run() {
        int lim = 775146;
        BigInteger bi = new BigInteger("600851475143");
        
        for (int i = lim; i >= 1; i--) {
            BigInteger bd = new BigInteger("" + i);
            
            if (bi.mod(bd) == BigInteger.ZERO && bd.isProbablePrime(10)) {
                System.out.println(bd);
                System.out.println(i);
                break;
            }   
        }
    }
}
