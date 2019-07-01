import java.util.*;

public class FruitFactory {

    public static void addFruits(List<Fruit> fruits) {


        try {




        } catch (InputMismatchException e) {
            System.err.println("Enter only digits");
        }

    }

    public List<Fruit> getFruitsByColor(List<Fruit> fruits, String color) {

        List<Fruit> newFruitsList = new ArrayList<Fruit>();

        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(color)) {
                newFruitsList.add(fruit);
            }
        }
        return newFruitsList;
    }

   /* public List<Fruit> sortByName(List<Fruit> fruits) {
        Collections.sort(fruits, new SortFruit());
        return fruits;

    }*/
}


