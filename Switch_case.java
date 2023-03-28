package myproject;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
		String output;
		String input;
		
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter the Aplhabet");
		 input=sc.next();
		switch(input)
		{
			case  "a" || "e" || "i" || "o" || "u":
				output="It is Vowal";
				break;
			case  "e":
				output="It is Vowal";
				break;
				
			case  "i":
				output="It is Vowal";
				break;
			case  "o":
				output="It is Vowal";
				break;
			
			case  "u":
				output="It is Vowal";
				break;
				
				default:output="It is contant";
			
		}

		System.out.println(output);
	}

}
