/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gussednumbergame;

import java.util.Random;
import java.util.Scanner;


public class GussedNumberGame {

    
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
         System.out.println("Guess the number");
         Scanner s = new Scanner(System.in);
        int gussed = s.nextInt();
         if (gussed == number)
         {
              System.out.println("You got it right");
         }else
         {
              System.out.println("you failed you guessed = " + gussed+ " , and my number was = " +number);
}

    }
    
}
