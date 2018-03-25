
package eleminationfactorial;


public class EleminationFactorial {

    public static void main(String[] args) {
        
        System.out.println(myExp(1, 10));
        System.out.println(Math.exp(1));
    }
    
      public static double myExp(double x, double n) {
        double result = 1;
        double firstElement = 1;
        for (int i =1; i <= n; i++)
        {
            firstElement = firstElement*(x/i);
            result =result + firstElement;
        }
        return result;
        
    }
}
