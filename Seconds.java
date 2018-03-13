/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignement;
 import java.util.Random;
import java.util.Scanner;

public class Asignement {

  
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
       int seconds = s.nextInt();
       int miniutesInSeconds = seconds /60;
       int hoursInSeconds = seconds / 3600;
       int secondsInSeconds = seconds%60;
       int minutes = miniutesInSeconds%60;
       System.out.println("number of hours = "+hoursInSeconds + ", number of min =  "+ minutes + " seconds = " +secondsInSeconds);

   }
    
}
    

   

