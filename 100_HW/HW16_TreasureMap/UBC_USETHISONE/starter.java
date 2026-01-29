/*
	Author:
	Date:
	Collaborator(s):
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a row: ");
		int row = sc.nextInt();
		System.out.print("Please enter a column: ");
		int column = sc.nextInt();

		System.out.println("Come find the treasure! X marks the spot!");
		System.out.println("Given the map below, you need to dig for the treasure!");
		System.out.println("- 0 means, the spot is untouched");
		System.out.println("- 1 means, the spot has been dug up");
		System.out.println("- 2 means, that's the spot you're currently on");
		System.out.println("- 3 means, that spot has been dug and you're on it");
		System.out.println("- 5 is the treasure!");

		Map merp = new Map(row, column);
		merp.generateTreasure();
		merp.printMap();

		while(true){
			System.out.println("What action would you like to take? Type the number in:");
			System.out.println("1 - Move Single");
			System.out.println("2 - Move Row/Column");
			System.out.println("3 - Dig");
			System.out.println("4 - Print Map");
			System.out.println("5 - Print Instructions");
			System.out.println("9 - Give Up");
			System.out.println();

			int ans = sc.nextInt();
			System.out.println();

			if(ans == 1){
				System.out.println("1-Up 2-Down 3-Left 4-Right 5-LU 6-RU 7-LD 8-RD");
				int m = sc.nextInt();
				if(merp.move(m))
					System.out.println("You moved successfully!");
				else
					System.out.println("Invalid move, try again!");
			}
			else if(ans == 2){
				System.out.println("Row:");
				int r = sc.nextInt();
				System.out.println("Column:");
				int c = sc.nextInt();
				if(merp.move(r,c))
					System.out.println("You moved successfully!");
				else
					System.out.println("Invalid move, try again!");
			}
			else if(ans == 3){
				if(merp.dig()){
					System.out.println("You found the treasure!");
					merp.printTreasureLoc();
					return;
				}
				else
					System.out.println("You didn't find the treasure. Keep trying!");
			}
			else if(ans == 4){
				merp.printMap();
			}
			else if(ans == 5){
				System.out.println("- 0 untouched");
				System.out.println("- 1 dug");
				System.out.println("- 2 you");
				System.out.println("- 3 dug + you");
				System.out.println("- 5 treasure");
			}
			else if(ans == 9){
				System.out.println("Sad to see you go!");
				merp.printTreasureLoc();
				return;
			}
			else{
				System.out.println("Wrong input");
			}

			System.out.println("------------------------------");
		}
	}
}

/* ================= MAP CLASS ================= */

class Map {
	private int[][] map;
	private int playerRow;
	private int playerCol;
	private int treasureRow;
	private int treasureCol;

	public Map(int r, int c) {
		map = new int[r][c];
		playerRow = 0;
		playerCol = 0;
		map[0][0] = 2;
	}

	public void generateTreasure() {
		treasureRow = (int)(Math.random() * map.length);
		treasureCol = (int)(Math.random() * map[0].length);

		if(treasureRow == 0 && treasureCol == 0){
			treasureRow = 1;
			treasureCol = 1;
		}

		map[treasureRow][treasureCol] = 5;
	}

	public void printMap() {
		System.out.println("MAP:");
		for(int i = 0; i < map.length; i++){
			System.out.print("| ");
			for(int j = 0; j < map[i].length; j++){
				if(map[i][j] == 5)
					System.out.print("0 ");
				else
					System.out.print(map[i][j] + " ");
			}
			System.out.println("|");
		}
		System.out.println();
	}

	public void printTreasureLoc() {
		System.out.println("Treasure was at row " + treasureRow + ", column " + treasureCol);
	}

	public boolean dig() {
		if(playerRow == treasureRow && playerCol == treasureCol)
			return true;

		if(map[playerRow][playerCol] == 2)
			map[playerRow][playerCol] = 3;

		return false;
	}

	public boolean move(int dir) {
		if(dir == 1) return move(playerRow-1, playerCol);
		if(dir == 2) return move(playerRow+1, playerCol);
		if(dir == 3) return move(playerRow, playerCol-1);
		if(dir == 4) return move(playerRow, playerCol+1);
		if(dir == 5) return move(playerRow-1, playerCol-1);
		if(dir == 6) return move(playerRow-1, playerCol+1);
		if(dir == 7) return move(playerRow+1, playerCol-1);
		if(dir == 8) return move(playerRow+1, playerCol+1);
		return false;
	}

	public boolean move(int r, int c) {
		if(r < 0 || c < 0 || r >= map.length || c >= map[0].length)
			return false;

		if(map[playerRow][playerCol] == 2) map[playerRow][playerCol] = 0;
		if(map[playerRow][playerCol] == 3) map[playerRow][playerCol] = 1;

		playerRow = r;
		playerCol = c;

		if(map[playerRow][playerCol] == 0) map[playerRow][playerCol] = 2;
		if(map[playerRow][playerCol] == 1) map[playerRow][playerCol] = 3;

		return true;
	}
}
