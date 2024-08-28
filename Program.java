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
        
        Calculator calc = new Calculator(num1,num2);
        System.out.println("The sum is: " + calc.getSum());
        System.out.println("The product is: " + calc.getProduct());
        System.out.println("The average is: " + calc.getAverage());
        System.out.println("The Absolute value is: " + calc.getAbsValue());
        System.out.println("The Maximum Value is: " + calc.getMaxValue());
        System.out.println("The Minimum Value is: " + calc.getMinValue());
    }
    
}



/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
 
    
    int sum;
    int product;
    double average;
    int absValue;
    int maxValue;
    int minValue;
    
    public Calculator(int num1, int num2)
    {
        sum = num1 + num2;
        product = num1*num2;
        average = sum/2.0;
        absValue = Math.abs(num1 - num2);
        maxValue = (absValue + num1 + num2)/2;
        minValue =  (Math.abs(num1 + num2) + absValue)/2;
        
        
        
        
        
    }
    
    public int getSum() {
        
        return sum;
    }
    
    public int getProduct() {
        
        return product;
        
    }
    
    public double getAverage() {
        
        return average;
    }
    
    public int getAbsValue() {
        
        return absValue;
    }
    
    public int getMaxValue() {
        
        return maxValue;
    }
    
    public int getMinValue() {
        
        return minValue;
    }
}

/*
Enter an integer: 
12
Enter another integer: 
20
The sum is: 32
The product is: 240
The average is: 16.0
The Absolute value is: 8
The Maximum Value is: 20
The Minimum Value is: 20
*/

