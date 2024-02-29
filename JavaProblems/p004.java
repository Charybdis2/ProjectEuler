package JavaProblems;

/**
 * @author Charybdis2
 */

public class p004 {
    
/**
 * Checks if the number isPalindrome
 * @param num Number to be checked
 * @return Boolean if it is a Palindrome
 */

    public static boolean isPalindrome(int num){
        String [] words = Integer.toString(num).split("");
        for (int i = 0;i<(words.length/2);i++){
            if (!words[i].equals(words[(words.length-1-i)])){
                return(false);
            }
        }
    return(true);
    } 

    public static void main(String[] args) {
        int largestP = 0;
        for (int i =100; i<999;i++){
            for (int j = 100; j<999;j++){
                if (isPalindrome(i*j) && largestP<(i*j) ){
                    largestP = i*j;
                }
            }
        }
        System.out.println(largestP);
    }

}


