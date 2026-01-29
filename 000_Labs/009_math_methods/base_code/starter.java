/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		int a = Math.max(13 - 6 * 11, (30 % 7) * (-2));
        
        
        double b = Math.sqrt(3 * 8 + (31 % 7));
        
        
        double c = Math.pow(37 / 3, 35 % 21);
        
        
        double d = Math.max(Math.pow(2, 14 % 3), Math.sqrt(2 * 6));
        
        System.out.println("Maximum = " + a);
        System.out.println("Square root = " + b);
        System.out.println("Power = " + c);
        System.out.println("Max = " + d);
		
		
		
		
		
		
		
		System.out.print("Give me a x value ");
		double x = sc.nextDouble();
		System.out.print("Give me a y value ");
		double y = sc.nextDouble();
		
		

		
		System.out.println(Math.max(x,y));
		System.out.println(Math.sqrt(y));
		System.out.println(Math.pow(x,y));
		
	}

}
