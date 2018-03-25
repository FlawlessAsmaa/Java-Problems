
package squareroot;


public class SquareRoot {

    
    public static void main(String[] args) {
        System.out.println(squareRoot(192.0));
        System.out.println(squareRoot2(192.0));
        System.out.println(Math.sqrt(192));

    }
    
    public static double squareRoot(double a) {
        
        double guess = a/2;
    double improve = (guess + (a/guess))/2;

    while (Math.abs((guess - improve)) > 0.0001){
        guess = improve;
        improve = (guess + (a/guess))/2;
    }
    return improve;
}
    
    public static double squareRoot2(double a){

        double guess = a/2; 
        double improve = (guess + (a/guess))/2; 

        double improve2= (improve + (a/improve))/2; 

        while (Math.abs((improve-improve2)) > 0.0001){  
            improve = (improve2 + (a/improve2))/2;
            improve2 = (improve + (a/improve))/2;
        }
        return improve2;
    }
}
