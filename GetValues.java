
package assignment.pkg1;

import java.util.Scanner;


public class GetValues {
    //Variables used in the equation y=mx+b
    //Getting x from the linear equation
    public static double getx(double x){
        double xvalue;
        Scanner input_x = new Scanner(System.in);
        System.out.println("What is your x value?");
        //Error checking used throughout the method that doesn't let the program progress until the user enters a valid value
        while(!input_x.hasNextDouble()){
            input_x.next();
            System.out.println("Invalid Input, please try again!");
        }
       xvalue = input_x.nextDouble();
       return xvalue;
    }
    //Getting y from the linear equation
    public static double gety(double y){
        double yvalue;
        Scanner input_y = new Scanner(System.in);
        System.out.println("What is your y value?");
        while(!input_y.hasNextDouble()){
            input_y.next();
            System.out.println("Invalid Input, please try again!");
        }
       yvalue = input_y.nextDouble();
       return yvalue;
    }
    //Getting m or slope from the linear equation
    public static double getslope(double slope){
        double slopevalue;
        Scanner input_slope = new Scanner(System.in);
        System.out.println("What is your slope?");
        while(!input_slope.hasNextDouble()){
            input_slope.next();
            System.out.println("Invalid Input, please try again!");
        }
       slopevalue = input_slope.nextDouble();
       return slopevalue;
    }
    //Getting y intercept from the linear equation
    public static double getycept(double ycept){
        double yceptvalue;
        Scanner input_ycept = new Scanner(System.in);
        System.out.println("What is your y intercept value?");
        while(!input_ycept.hasNextDouble()){
            input_ycept.next();
            System.out.println("Invalid Input, please try again!");
        }
       yceptvalue = input_ycept.nextDouble();
       return yceptvalue;
    }
    //Equations used for the equation (y2-y1)/(x2-x1)
    //Getting the first y value
    public static double gety1(double y1){
        double y1value;
        Scanner input_y1 = new Scanner(System.in);
        System.out.println("What is your first y value?");
        while(!input_y1.hasNextDouble()){
            input_y1.next();
            System.out.println("Invalid Input, please try again!");
        }
       y1value = input_y1.nextDouble();
       return y1value;
    }
    //Getting the second y value
    public static double gety2(double y2){
        double y2value;
        Scanner input_y2 = new Scanner(System.in);
        System.out.println("What is your first y value?");
        while(!input_y2.hasNextDouble()){
            input_y2.next();
            System.out.println("Invalid Input, please try again!");
        }
       y2value = input_y2.nextDouble();
       return y2value;
    }
    //Getting the first x value
    public static double getx1(double x1){
        double x1value;
        Scanner input_x1 = new Scanner(System.in);
        System.out.println("What is your first x value?");
        while(!input_x1.hasNextDouble()){
            input_x1.next();
            System.out.println("Invalid Input, please try again!");
        }
       x1value = input_x1.nextDouble();
       return x1value;
    }
    //Getting the second x value
    public static double getx2(double x2){
        double x2value;
        Scanner input_x2 = new Scanner(System.in);
        System.out.println("What is your second x value?");
        while(!input_x2.hasNextDouble()){
            input_x2.next();
            System.out.println("Invalid Input, please try again!");
        }
       x2value = input_x2.nextDouble();
       return x2value;
    }
}
