
package determineexp;


public class DetermineExp {

    
    public static void main(String[] args) {
        System.out.println(myExp(1, 10));
        System.out.println(Math.exp(1));

        
    }
    public static double myExp(double x, double n) {
        double result = 1;
        for (int i =1; i <= n; i++)
        {
            result = result + (power(x, i)/ factorial(i));
        }
        return result;
        
    }
    
    public static double factorial (double number) {
        double result = 1;
        for (int i =1; i <= number; i++) {
            result = result * i;
            
        }
        return result;
    }
    
    public static double power(double number, double exp) {
        double result = 1;
        if (exp ==0) {
            return 1;
        } else if (exp ==1) {
            return number;
        } else {
            for (int i = 1; i <= exp; i++)
            {
                result = result * number;
            }
            
        }
        return result;
    }
}
