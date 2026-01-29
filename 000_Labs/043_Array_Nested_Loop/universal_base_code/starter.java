/*
 * Author:
 * Date:
 */

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a symbol");
		String s = sc.nextLine();
		System.out.println("Give me a width");
		int w = sc.nextInt();
		System.out.println("Give me a height");
		int h = sc.nextInt();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}
