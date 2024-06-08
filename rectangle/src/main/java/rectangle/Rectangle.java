/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rectangle;
import java.util.Scanner;
public class Rectangle {
    private double length;
    private double width;
    
    public  Rectangle(double length,double width){
        this .length=length;
        this .width= width;
        
    }

   public  void calculation(){
        double area= length*width;
        double perimeter=2*(length+width);
        
        System.out.println(" The area of the rectangle is :"+area);
        System.out.println(" The perimeter of the rectangle is :"+perimeter);
        
        
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter the length of rectangle 1 :");
        double length1 = scanner.nextDouble();
        System.out.println("Enter the width of rectangle 1:");
        double width1 = scanner.nextDouble();
        
        
         System.out.println("Enter the length of rectangle 2 :");
        double length2 = scanner.nextDouble();
        System.out.println("Enter the width of rectangle 2:");
        double width2 = scanner.nextDouble();
        
        
       Rectangle rect1 = new Rectangle (length1,width1);
       Rectangle rect2 =new Rectangle (length2,width2);
        System.out.println("result for rectangle 1 is :");
        rect1.calculation();
        System.out.println("result for rectangle 2 is :");
        rect2.calculation();
    }
}
