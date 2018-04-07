
package dateformat;


public class DateFormat {


    public static void main(String[] args) {
        
          printAmerican("Sat", "April", 7, 2018);
          printEuropean("Fri", "Dec", 21, 1991);
          
    }
    
    
     public static void printAmerican (String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
        
    }
     
     public static void printEuropean(String day, String month, int date, int year) {
         System.out.println(day + ' ' + date + ' ' + month + ", " + year);
     }
}
