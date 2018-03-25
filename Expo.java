/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo;


public class Expo {

    
    public static void main(String[] args) {
       System.out.println(power(3,2));
       
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
