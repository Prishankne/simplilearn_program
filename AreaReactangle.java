package myproject;

import java.util.Scanner;

public class AreaReactangle {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner (System.in);
    System.out.println("enter length:");
                     
    int length=sc.nextInt();                 
    System.out.println("enter height:");
   int breath=sc.nextInt();
     System.out.println("Area of Reactangle: "+length*breath);            
	}

}
