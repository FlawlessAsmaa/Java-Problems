
package oddsum;

import java.util.Scanner;


public class OddSum {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter your positive  odd number plz ! ");
        int number = s.nextInt();
        int result = oddSum (number);
        System.out.println("The sum of the odd number is =  " + result);
    }
    public static int oddSum(int number) {
        int sum =0;
        for (int i =number; i > 0;i-- )
        {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    
}
