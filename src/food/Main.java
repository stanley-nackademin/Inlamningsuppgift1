package food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Vilket djur ska få mat?");
        Scanner input = new Scanner(System.in);
        input.nextLine();*/

        InitTest test = new InitTest();

        //test.d1.printInfo();
        //test.d1.feedInfo();

        DietCoach coach = new DietCoach("Test");
        coach.feedInfo(test.d1);
        coach.feedInfo(test.c1);
    }
}

class InitTest {

    Dog d1 = new Dog("Sixten", 5000);
    Dog d2 = new Dog("Dogge", 10000);
    Cat c1 = new Cat("Venus", 5000);
    Cat c2 = new Cat("Ove", 3000);
    Snake s1 = new Snake("Hypno", 1000);
}

