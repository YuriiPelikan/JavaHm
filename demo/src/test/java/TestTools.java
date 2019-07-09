import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTools {
    Tools tools = new Tools();

    @Test
    public void sortFruitTest() {
        //Arrange
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "yellow"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("cherry", "red"));

        ArrayList<Fruit> expected = new ArrayList<>();
        expected.add(new Fruit("apple", "yellow"));
        expected.add(new Fruit("cherry", "red"));
        expected.add(new Fruit("grape", "green"));

        ArrayList<String> expectedString = new ArrayList<>();
        ArrayList<String> actualString = new ArrayList<>();
        //Act
        List<Fruit> actual = tools.SortFruit(expected);
        for (Fruit fruit : expected) {
            expectedString.add(fruit.getName());
        }
        for (Fruit fruit : actual) {
            actualString.add(fruit.getName());
        }
        //Assert
        Assert.assertEquals(expectedString, actualString);
    }


    @Test
    public void getFruitsByColorTest() {
        //Arrange
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "yellow"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("cherry", "red"));

        ArrayList<Fruit> actual = new ArrayList<>();
        actual.add(new Fruit("apple", "yellow"));

        ArrayList<String> expectedString = new ArrayList<>();
        ArrayList<String> actualString = new ArrayList<>();
        //Act
        List<Fruit> expected = tools.fruitsByColor(fruits, "yellow");
        for (Fruit fruit : expected) {
            expectedString.add(fruit.getColor());
        }
        for (Fruit fruit : actual) {
            actualString.add(fruit.getColor());
        }
        //Assert
        Assert.assertEquals(expectedString,actualString);
    }
}