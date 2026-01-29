/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a random number between 1 and 1000: ");
		int x= sc.nextInt();
		int y = (int)(Math.random() * 999 +1 );
		if(x==y){
			System.out.println("Your answer is right. COngrats");
		}
		else{
			System.out.println("Your wrong");
		}
	}
	
}
