import java.util.Scanner;


public class Exercises {
    // Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
    public double fahrenheitToCelsius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fahrenheit degree");
        double fahrenheit =  sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
    //Write a Java program that reads a number in inches and converts it to meters.
    public double inchesToMeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inches number");
        double inches =  sc.nextDouble();
        double metres = inches*0.0254;
        return metres;
    }

}
