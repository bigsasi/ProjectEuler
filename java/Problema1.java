/* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

*/

public class Problema1 {

    private final static int lim = 1000;

    public static void main(String[] args) {
        Problema1 problema1 = new Problema1();
        problema1.run();
    }
    
    public void run() {
        int sum = 0;
        for (int i = 3; i < lim; i = i + 3) {
            if (i % 5 == 0) continue;
            sum += i;
        } 
        for (int i = 5; i < lim; i = i + 5) {
            sum += i;
        }
        
        System.out.println(sum);
    }
}
