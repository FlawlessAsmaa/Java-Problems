/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import java.util.Scanner;
public class Addition {

    /**
     Write a program that asks the user to input 3 different numbers.
     Your program should calculate the addition and multiplication of the 3 numbers.
     Then output the results each in separate line.
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
      
           System.out.println("addition result =   " + (a+b+c));
           System.out.println("Multiplication result =   " + (a*b*c));
    }
    
}
