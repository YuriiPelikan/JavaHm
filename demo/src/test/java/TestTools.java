import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class TestTools {
    Tools tools = new Tools();

    @Test
    public void testSortByName() {
        //Arrange
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "yellow"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("cherry", "red"));

        List<Fruit> expected = new ArrayList<>();
        expected.add(new Fruit("apple", "yellow"));
        expected.add(new Fruit("cherry", "red"));
        expected.add(new Fruit("grape", "green"));

        //Actual
        List<Fruit> actual = tools.SortFruit(expected);

        //Assert
        assertEquals(expected, actual);
    }


   /* @Test
    public void testFruitsByColor(List<Fruit> expected, String color) {
        //Arrange
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "yellow"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("cherry", "red"));

        List<Fruit> expectedYellow = new ArrayList<>();
        expectedYellow.add(new Fruit("apple", "yellow"));

        List<Fruit> actual = tools.fruitsByColor(expected);
        assertEquals(expectedYellow, actual);
    }
*/


}