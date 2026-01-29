import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a number: "); 
		int x = sc.nextInt();
		System.out.print("Give me a 2nd number: "); 
		int y = sc.nextInt();
		if(x==y){
			System.out.println(x +" and "+ y + " are  equal to each other");
		
		}
	
		else{
			System.out.println(x +" and "+ y + " are not equal to each other");
	
		}
		}
	
}