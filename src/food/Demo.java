package food;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public Demo() {

        // Create test data
        Dog d1 = new Dog("Sixten", 5000);
        Dog d2 = new Dog("Dogge", 10000);
        Cat c1 = new Cat("Venus", 5000);
        Cat c2 = new Cat("Ove", 3000);
        Snake s1 = new Snake("Hypno", 1000);

        List<Animal> animals = new LinkedList<>();
        animals.add(d1);
        animals.add(d2);
        animals.add(c1);
        animals.add(c2);
        animals.add(s1);

        while (true) {
            System.out.println("Vilket djur ska få mat?");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            if (s.isEmpty()) {
                break;
            }
            Feeder a = AnimalFeeder.getAnimal(s, animals);
            if (a != null) {
                a.feedInfo();
            } else {
                System.out.println("Can not find animal with the given name");
            }
        }
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
    }
}
