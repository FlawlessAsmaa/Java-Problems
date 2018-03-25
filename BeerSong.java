/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;


public class BeerSong {

    
    public static void main(String[] args) {
        beer_song();
    }
    
     public static void beer_song() {
        for (int i = 99; i >=0; i--)
        if (i != 0 && i != 1) 
        System.out.println(i + " bottles of beer on the wall, \n" + i + " bottles of beer, \n" + "ya' take one down, ya' pass it around,\n"+ (i-1)+ " bottles of beer on the wall. \n ");
        else if (i == 1){
            System.out.println(i + " bottle of beer on the wall, \n" + i + " bottle of beer, \n" + "ya' take one down, ya' pass it around,\n"+  "No bottles of beer on the wall. \n ");
        }
        else if (i == 0 ){
        System.out.println("No bottles of beer on the wall,\nno bottles of bee,\nya can't take one down,\nya can't pass it around,\n'cause there are no more bottles of beer on the wall!");
    }
    } 
      

    
}
