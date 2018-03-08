/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import java.util.Scanner;
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter the firsr Number Please = ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
         System.out.println("Enter the second Number Please = ");
         b = s.nextInt();
          System.out.println("Enter the third Number Please = ");
          c = s.nextInt();
          
          int add = a + b + c;
          int mult = a * b * c;
           System.out.println("addition result =   " + add);
            System.out.println("Multiplication result =   " + mult);
    }
    
}
