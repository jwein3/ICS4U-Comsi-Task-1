package assignment.pkg1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment1 extends GetValues {
  double x;
  double y;
  double ycept;
  double slope;
  double x2;
  double x1;
  double y2;
  double y1;
  String choice;
    
    
    public Assignment1(){
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Hello, This program will help you solve your linear equations!");
        System.out.println("");
        System.out.println("What would you like to solve for?");
        System.out.println("1. Solve for y");
        System.out.println("2. Solve for x");
        System.out.println("3. Solve for y intercept");
        System.out.println("4. Solve for slope");
        System.out.println("5. Find slope using 2 points");
        choice = scan.nextLine();
        switch(choice){
            case "1":
               x=getx(x);
               slope=getslope(slope);
               ycept=getycept(ycept);
               break;
            case "2":
               y=gety(y);
               slope=getslope(slope);
               ycept=getycept(ycept);
               break;
            case "3":
               x=getx(x);
               y=gety(y);
               slope=getslope(slope); 
               break;
            case "4":
                x=getx(x);
                y=gety(y);
                ycept=getycept(ycept);
                break;
            case "5":
                y2=gety2(y2);
                y1=gety1(y1);
                x2=getx2(x2);
                x1=getx2(x1);
                break;
            default:
                System.out.println("Invalid input, please try again!");
                break;
        }
       
    }
    public static void main(String[] args) {
        boolean again = true;
        String quit;
        Scanner cont = new Scanner(System.in);
        DecimalFormat format_num = new DecimalFormat("#.00");
        while(again){
        Assignment1 equation1 = new Assignment1();
        switch(equation1.choice){
            case "1":
                System.out.println("Your y value is: "+format_num.format((equation1.x*equation1.slope+equation1.ycept)));
                break;
            case "2":
                if(equation1.slope==0){
                    System.out.println("Invalid Answer! You can't divide by 0!");
                }
                else{
                System.out.println("Your x value is: "+format_num.format(((equation1.y-equation1.ycept)/equation1.slope)));
                }
                break;
            case "3":
                System.out.println("Your y intercept value is: "+format_num.format((equation1.y-(equation1.x*equation1.slope))));
                break;
            case "4":
                if(equation1.x ==0){
                    System.out.println("Invalid Answer! You can't divide by 0!");
                }
                else{
                System.out.println("Your slope value is: "+format_num.format(((equation1.y-equation1.ycept)/equation1.x)));
                }
                break;
            case "5":
                if((equation1.x2-equation1.x1)==0){
                  System.out.println("Invalid Answer! You can't divide by 0!");  
                }
                else{
                System.out.println("Your slope value from these 2 points are: "+format_num.format((equation1.y2-equation1.y1)/(equation1.x2-equation1.x1)));
                }
                break;
        }
            System.out.println();
            System.out.println("Do you want to go again? Press n to quit, press any other key to continue! ");
            quit = cont.nextLine();
            if("n".equalsIgnoreCase(quit)){
                again = false;
            }
            else{
                again = true;
            }
        }
        
        System.out.println("Goodbye!");
            
       
        
        

        
        
        
    }
    
  
        
    }
