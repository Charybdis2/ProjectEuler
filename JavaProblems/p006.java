package JavaProblems;

public class p006 {
    

    public static double squareSum(){
        double total = 0;
        double total2 = 0;
        for (double i =0; i<101;i++){
            total += i;
            total2 += Math.pow(i, 2);
        }
        total = Math.pow(total, 2);
        total = total - total2;
        return (total);
        
        
    
    }
    

    public static void main(String[] args) {
        System.out.printf("%.0f%n", squareSum());
    }
}
