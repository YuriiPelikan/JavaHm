import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTools {
    Tools tools = new Tools();

    @Test
    public void sortFruitTest() {
        //Arrange
        ArrayList<String> expectedName = new ArrayList<>();
        ArrayList<String> actualName = new ArrayList<>();

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "yellow"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("cherry", "red"));

        ArrayList<Fruit> expected = new ArrayList<>();
        expected.add(new Fruit("apple", "yellow"));
        expected.add(new Fruit("cherry", "red"));
        expected.add(new Fruit("grape", "green"));
        //Act
        List<Fruit> actual = tools.SortFruit(expected);
        for (Fruit fruit : expected) {
            expectedName.add(fruit.getName());
        }
        for (Fruit fruit : actual) {
            actualName.add(fruit.getName());
        }
        //Assert
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void fruitsByColorTest() {
        ArrayList<String> expectedColor = new ArrayList<>();
        ArrayList<String> actualColor = new ArrayList<>();

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "yellow"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("cherry", "red"));

        ArrayList<Fruit> expected = new ArrayList<>();
        fruits.add(new Fruit("apple", "yellow"));
        //Actual
        List<Fruit> actual = tools.fruitsByColor(expected);
        for (Fruit fruit2 : expected) {
            expectedColor.add(fruit2.getColor());
        }
        for (Fruit fruit2 : actual) {
            actualColor.add(fruit2.getColor());
        }
        //Assert
        Assert.assertEquals(expected, actual);
    }
}