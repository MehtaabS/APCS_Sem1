package pkg;
public class Spiderman {
	String actor;
	int age;
	String villain;

	public Spiderman() {
		actor = "Unknown";
		age = 0;
		villain = "Unknown";
	}

	public Spiderman(String a) {
		actor = a;
		age = 0;
		villain = "Unknown";
	}
	public Spiderman(int ag) {
		actor = "Unknown";
		age = ag;
		villain = "Unknown";
	}

	public Spiderman(String a, int ag) {
		actor = a;
		age = ag;
		villain = "Unknown";
	}

	public Spiderman(String a, int ag, String v) {
		actor = a;
		age = ag;
		villain = v;
	}
	public String getActor() {
		return actor;
	}

	public int getAge() {
		return age;
	}

	public String getVillain() {
		return villain;
	}

	public void setActor(String a) {
		actor = a;
	}

	public void setAge(int ag) {
		age = ag;
	}

	public void setVillain(String v) {
		villain = v;
	}


	
	public void fight() {
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt() {
		System.out.println("           :              ");
		System.out.println("           ;              ");
		System.out.println("          :               ");
		System.out.println("          ;               ");
		System.out.println("         /                ");
		System.out.println("       o/                 ");
		System.out.println("     ._/\\___,             ");
		System.out.println("         \\                ");
		System.out.println("         /                ");
	}
}
