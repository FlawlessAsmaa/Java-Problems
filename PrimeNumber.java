
package primenumber;

import java.util.Scanner;


public class PrimeNumber {

   
    public static void main(String[] args) {
        System.out.println("Enter a Number to know if it is a prime number or not : ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int i, flag =0;
        for (i = 2; i <= number-1; i++)
        {
            if (number % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
        {
            System.out.println("It is not a prime Number");
        } else {
            System.out.println("It is a prime Number");
        }
    }
    
}
