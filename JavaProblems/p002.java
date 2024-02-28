package JavaProblems;

/**
 * @author Charybdis2
 */

public class p002 {
    

    public static long SumEvenFibonacci(int n) {
        long sum = 0;
        long a = 1, b = 2; 
        while (b <= n) {
            if (b % 2 == 0) { 
                sum += b;
            }
            long next = a + b; 
            a = b; 
            b = next; 
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumEvenFibonacci(4000000));
    }
}
     




