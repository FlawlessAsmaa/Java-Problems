
package factorial;

import java.util.Scanner;

public class Factorial {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to determine it is factorial !");
        double number = s.nextDouble();
        System.out.println(factorial(number));
    }
    
    public static double factorial (double number) {
        double result = 1;
        for (int i =1; i <= number; i++) {
            result = result * i;
            
        }
        return result;
    }
}
