/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Whats your name? ");
		String name = sc.nextLine();
		System.out.print("How old are you? "); 
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("What is your birthday Month?1-12)");
		int month = sc.nextInt();
		System.out.print("What is your birthday Day?");
		int day = sc.nextInt();
		System.out.print("What is your birthday year?");
		int year = sc.nextInt();
		System.out.print("How much is a buck fifty?");
		double dollar = sc.nextDouble();
	}
}
