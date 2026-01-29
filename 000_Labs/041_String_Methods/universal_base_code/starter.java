import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first and last name include space between the names");
		String fullname = sc.nextLine();
		int space=fullname.indexOf(" ");
		String last=fullname.substring(space+1);
		System.out.println("Your last name is "+ last);
		
		
	
		


		
	}
}
