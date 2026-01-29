package pkg;
import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex");
        d1.setAge(5);
        Dog d2 = new Dog("Buddy", "Golden Retriever");

        if (d1.isSleeping())
            System.out.println(d1.getName() + " is asleep");
        else {
            d1.bark();
            if (!d2.isSleeping())
                d2.bark();
        }
    }
}
