
package triple;

import java.util.Scanner;


 
public class Triple {

    /**
     Write a program that asks the user to input 2 different numbers. 
     * Your program should double the first number, 
     * triple the second number 
     * and show the result of addition them after.
     */
    public static void main(String[] args) {
        int a, b;
        System.out.println("Please enter the first number = ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("Please enter the second number = ");
        b = s.nextInt();
        int result = (2*a) + (3*b);
        System.out.println("result of adding double of the first number and triple of the second number = " + result);
    }
    }
    

