
package multiadd;


public class MultiAdd {

    public static void main(String[] args) {
        System.out.println(multiAdd(1.0,2.0,3.0));
        
        System.out.println("==================");
        
        double num1 = Math.cos(Math.PI/4);
        double num2 = 1.0/2.0;
        double num3 = Math.sin(Math.PI/4);
        System.out.println(multiAdd(num1, num2, num3));
        
        System.out.println("==================");
        
        double num4 = 1.0;
        double num5 = Math.log(10);
        double num6 = Math.log(20);
        System.out.println(multiAdd(num4, num5, num6));
        
        System.out.println("==================");
        
        
    }
    
    public static double multiAdd(double num1, double num2, double num3) {
        return num1 * num2 + num3; 
    }
    
    public static void expSum (double x) {
        double num1 = x;
        double num2 = Math.exp(-x);
        double num3 = Math.sqrt(1.0 - num2);
        
        multiAdd(num1, num2, num3);
    }
}
