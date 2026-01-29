import java.util.Scanner;/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Numba 1: ");
        int num1=sc.nextInt();
        System.out.println("Numba 2: ");
        int num2=sc.nextInt();
        
	    add(num1, num2);
	    int y = square(num2);
        System.out.println(y);
        System.out.println(square(num2));
        int x= absValue(num1);
        System.out.println(x)
        
    }
	public static int absValue(int value);{
	    if(value<0){
	       return value*(-1);
	    }
	    else{
	        return value;
	    }
	}
	
	
	public static int square(int a){
	    int answer = a*a;
	    return answer;
	    
	}
	
	
	
	
	public static void add(int a, int b){
	    int sum=a+b;
	    System.out.println(sum);
	    return;//// dont put anything next to return whem its void
	    
	}
}