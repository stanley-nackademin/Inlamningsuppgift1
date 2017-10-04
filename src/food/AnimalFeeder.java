package food;

import java.util.List;

public class AnimalFeeder {

    /**
     * Search and get an animal with the given name from a list of animals
     * @param name The animal's name to search for
     * @param animals List of all animals
     * @return Returns an animal of type Feeder, returns null if animal could not be found
     */
    public static Feeder getAnimal(String name, List<Animal> animals) {

        String s = name.trim();

        for (Animal a : animals) {
            if (a.getName().equalsIgnoreCase(s)) {
                return (Feeder)a;
            }
        }

        return null;
    }
}
