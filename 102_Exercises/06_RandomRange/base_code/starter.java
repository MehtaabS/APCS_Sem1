/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a number: ");
		int num1 = sc.nextInt();
		System.out.print("Give me a second number(Bigger than first): ");
		int num2 = sc.nextInt();
		if(num2 < num1){
			System.out.println("Error, your second number is shorter than the first");
			System.out.println("Give me a second number(Bigger than first): ");
			num2 =sc.nextInt();
		}
		int dum1 = (int)(Math.random()*(num2-num1)+num1);
		int dum2 = (int)(Math.random()*(num2-num1)+num1);
		int dum3 = (int)(Math.random()*(num2-num1)+num1);
		int dum4 = (int)(Math.random()*(num2-num1)+num1);
		int dum5 = (int)(Math.random()*(num2-num1)+num1);
		
		System.out.println("The 5 integers: "+dum1+", " + dum2+", " + dum3+", " + dum4+", " + dum5);
		
	
	}
}
