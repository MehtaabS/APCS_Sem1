/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name ");
		String x= sc.nextLine();
		System.out.println("what is your title:  ");
		String y= sc.nextLine();
		System.out.println("What would you like to be The Hulk, Iron Man, or Captain America");
		String z= sc.nextLine();
		System.out.println("You've choosen "+z+". Excellent!!");
		System.out.println("You have 20 skill points to spend in the following: Strength, Agility, Intelligence, and Speed. Spend them wisely.");
		int r= 20;
		System.out.println("Strength (1-10): ");
		int a= sc.nextInt();
		if(a<=10){
			r=r-a;
			System.out.println("You have "+r+" Skill points left");
			
			
		}
		else{
			System.out.println("Please input a smaller value. Strength (1-10):");
			a= sc.nextInt();
			
		}
		System.out.println("Agility (1-10): ");
		int b= sc.nextInt();
		if(b<=10){
			r=r-b;
			System.out.println("You have "+r+" Skill points left");
			
			
		}
		else{
			System.out.println("Please input a smaller value. Agility (1-10):");
			b= sc.nextInt();
		}
		System.out.println("Intelligence (1-10): ");
		int c= sc.nextInt();
		if(c<=10){
			r=r-c;
			System.out.println("You have "+r+" Skill points left");
			
			
		}
		else{
			System.out.println("Please input a smaller value. Strength (1-10):");
			c= sc.nextInt();
			
		}
		System.out.println("Speed (1-10): ");
		int d= sc.nextInt();
		if(d<=10){
			r=r-d;
			System.out.println("You have "+r+" Skill points left");
			
			
		}
		else{
			System.out.println("Please input a smaller value. Agility (1-10):");
			d= sc.nextInt();
		
		}
		System.out.println("You are " + x+", "+y+". ");
		System.out.println("You're "+z+" with the following stats.");
		System.out.println("Strength (1-10): "+ a);
		System.out.println("Agility (1-10): "+b);
		System.out.println("Intelligence (1-10): "+c);
		System.out.println("Speed (1-10): "+d);
		
		
		
		
	}
}
