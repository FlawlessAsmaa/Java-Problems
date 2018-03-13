
package celsiusdegreeconverter;

import java.util.Scanner;


public class CelsiusDegreeConverter {


    public static void main(String[] args) {
      float celDegree, fehDegree;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter temperature in Celsius :");
      celDegree=s.nextInt();
      fehDegree = celDegree * 9/5 + 32;
      System.out.println("Temp. in Fahrenheit: "+fehDegree);

    }
    
}
