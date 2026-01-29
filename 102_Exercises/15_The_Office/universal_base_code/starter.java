/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee dwight= new Employee(1987,"Dwight","Schrute",4416.66);
		Employee jim= new Employee(22474,"Jim","Halpert",4416.66);
		Employee pam= new Employee(2011,"Pam","Beesly",2250);
		Employee bob= new Employee(2034,"Bob","Throb",4600);
		dwight.raiseSalary(13);
		jim.raiseSalary(15);
		pam.raiseSalary(20);
		bob.raiseSalary(50);
		double salery1=dwight.getAnnualSalary();
		double salery2=jim.getAnnualSalary();
		double salery3=pam.getAnnualSalary();
		double salery4=bob.getAnnualSalary();
		dwight.employeeToString();
		System.out.println("The annual salery for Dwight is "+salery1);
		System.out.println("");
		jim.employeeToString();
		System.out.println("The annual salery for Jim is "+salery2);
		System.out.println("");
		pam.employeeToString();
		System.out.println("The annual salery for Pam is "+salery3);
		System.out.println("");
		bob.employeeToString();
		System.out.println("The annual salery for Bob is "+salery4);
		System.out.println("");
		
		
		
	}
}
