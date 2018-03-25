
package rebuildguessednumber;
import java.util.Random;
import java.util.Scanner;
public class RebuildGuessedNumber {

 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("my number  is = " +number);
        
        int guessed;
        boolean win = false;
        
        while (win == false){
            System.out.println("Guess the number to see if it like what i guess or not");
            guessed = s.nextInt();
            if (guessed == number){
            win = true; 
            } else if (guessed > number){
                System.out.println("Your number is bigger !");
            } else if (guessed < number){
                System.out.println("Your number is Lower !");
            }
            
        }
        System.out.println("Holy Moly, you got it right !!");
            
            
    
    
}
    }

/*      public static void guess_again(){
         Scanner s = new Scanner(System.in);
         System.out.println("Try another guess !!");
         int choice = s.nextInt();
         
     }
}
*/