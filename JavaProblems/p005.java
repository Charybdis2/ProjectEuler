package JavaProblems;


/**
 * @author Charybdis
 */

public class p005 {
    public static void main(String[] args){
        boolean flag = false;
        long i = 0;
        while (flag == false){
            i ++;
            if (i % 11 == 0 && i % 13 == 0 && i % 14 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0){
                System.out.println(i);
                flag = true;
            }
        }
    }
}
