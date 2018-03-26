package arrays_lec;

import java.util.Scanner;

public class Arrays_Lec {

    public static void main(String[] args) {
        double temp[] = new double[7];
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the temperature of seven days");
        double total = 0;
        for (int i = 0; i < 7; i++) {
            temp[i] = s.nextDouble();
            total = total + temp[i];
        }
        System.out.println("The average of the temperature is : " +total / temp.length);

    }

}
