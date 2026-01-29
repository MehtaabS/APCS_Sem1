import pkg.*;

public class starter {
	public static void main(String args[]) {
		Spiderman a = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman b = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman c = new Spiderman("Tom Holland", 27);
		c.setVillain("Vulture");
		Spiderman d = new Spiderman("Miles Morales");
		d.setAge(18);
		d.setVillain("Prowler");

		System.out.println(a.getActor() + " fights " + a.getVillain());
		a.fight();
		System.out.println(b.getActor() + " fights " + b.getVillain());
		b.fight();
		System.out.println(c.getActor() + " fights " + c.getVillain());
		c.fight();
		System.out.println(d.getActor() + " fights " + d.getVillain());
		d.fight();
		a.printArt();
	}
}
