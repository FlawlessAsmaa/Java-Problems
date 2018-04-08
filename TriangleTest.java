/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletest;


public class TriangleTest {

   
    public static void main(String[] args) {
        System.out.println(isTriangle(1,1,12));
        System.out.println(isTriangle(9,5,12));
    }
    
    public static boolean isTriangle(int stick1, int stick2, int stick3) {
        boolean result = false;
        if (stick1 + stick2 <stick3 || stick2 + stick3 < stick1 || stick1 + stick3 < stick2) {
            return result;
        }
        else {
            result = true;
        }
        return result;
}
}
