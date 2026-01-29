/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int ram = ((int)(Math.random()*150) + 51);
		int[] arr = new int[ram];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		double avg = sum / arr.length;
		System.out.println("Number of items: " + arr.length);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + avg);

		BaseClass test = new BaseClass();
	}
}
