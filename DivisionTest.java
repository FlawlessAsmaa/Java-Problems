
package divisiontest;


public class DivisionTest {

   
    public static void main(String[] args) {
        System.out.println(isDivisable(25,5));
        System.out.println(isDivisable(15,2));
    }
    
    public static boolean isDivisable(int n, int m) {
         boolean result = false;
         if (n % m == 0){
             result = true;
         }
         else {
             result = false;
         }
         return result;
     }
    
}
