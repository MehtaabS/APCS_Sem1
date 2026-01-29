/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr =new int[1001];
		int index1=0;
		int value1=3;
		
		while(index1 < 1001){
			arr[index1]=value1;
			value1=value1+3;
			index1=index1+1;
			
		
		}
		int counter=0;
		while(counter<1001){
			System.out.println(arr[counter]);
			counter++;
		} 
		int [] arr1 =new int[1001];
		int index2=0;
		int value2=1000;
		while(index2<1001){
			arr1[index2]=value2;
			value2=value2-1;
			index2=index2+1;
			
		} 
		int counter1=0;
		while(counter1<1001){
			System.out.println(arr1[counter1]);
			counter1++;
		}
	}
}
