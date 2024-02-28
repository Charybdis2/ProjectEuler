package JavaProblems;

/**
 * @author Charybdis2
 */

public class p001{

/**
 * This can be done more efficiently but it's already really
 * fast
 */

    public static int isDivByThreeAndFive(){
        int total = 0;
        for (int i =0;i<1000;i++){
            if (i%3 ==0 || i%5==0){
                total += i;
            }
        }
        return(total);
    }

    public static void main(String[] args) {
        System.out.println(isDivByThreeAndFive());
    }
    
}