import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns:");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = (int)(Math.random() * 10) + 1;
			}
		}
		printArray(arr);
		for (int i = 0; i < arr.length; i++) {
			rowAverage(arr, i);
		}
		System.out.println("Average of all values: " + overallAverage(arr));
	}
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void rowAverage(int[][] arr, int row) {
		double sum = 0;
		for (int j = 0; j < arr[row].length; j++) {
			sum += arr[row][j];
		}
		double avg = sum / arr[row].length;
		System.out.println("Row " + row + " average: " + avg);
	}
	public static double overallAverage(int[][] arr) {
		double sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		return sum / count;
	}
}
