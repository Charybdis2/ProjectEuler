package JavaProblems;

/**
 * @author Charybdis2
 */


public class p003 {

/**
 * Simple isPrime() function, using squar(num) trick to increase speed
 * @param num to be checked if it is prime
 * @return Boolean value
 */

    public static boolean isPrime(long num){
        for (int i=2; i<Math.sqrt(num);i++){
            if (num%i==0){
                return(false);
            }
        }
        return true;
    }
    
/**
 * 
 * @param num the number to be tried 
 * @return Largest Factor that is prime
 */
    public static long LargestPrimeFactor(long num){
        long currentLargest = 0;
        for (long i =1;i<(Math.sqrt(num));i++){
            if (num%i==0){
                    if (isPrime(i)){
                        currentLargest = i;
                }
            }
        }
        return(currentLargest);
    }

    public static void main(String[] args) {
        System.out.println(LargestPrimeFactor(600851475143l));
    }

}
