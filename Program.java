//import stuff here
import java.util.Scanner;

//Your code here
public class Program8 {
    public static void main(String[] args) {
        int num1;
        int num2;
        
        
        System.out.println("Enter an integer: ");
        
        Scanner numScanner1 = new Scanner(System.in);
        num1 = numScanner1.nextInt();
        
        
        System.out.println("Enter another integer: ");
        Scanner numScanner2 = new Scanner(System.in);
        num2 = numScanner2.nextInt();
        
        Calculator calc = new Calculator(num1, num2);
        
    }
    
}


//Paste console output below:
/*


*/




/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator(int num1, int num2)
    {
        int sum = num1 + num2;
        int product = num1*num2;
        double average = sum/2.0;
        int absValue = Math.abs(num1 - num2);
        int maxValue = absValue + num1 + num2;
        int minValue =  Math.abs(num2 - num1) + num1 + num2;
        
        
        
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

