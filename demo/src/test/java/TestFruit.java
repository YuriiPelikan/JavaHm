import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFruit {

    @Test
    public void inputTest() {
        Fruit actual = new Fruit();
        Fruit expected = new Fruit("grape", "green");
        actual.setName("grape");
        actual.setColor("green");
        //Assert.assertEquals(actual result, expected result);
        Assert.assertEquals(actual.getName(), expected.getName());
        Assert.assertEquals(actual.getColor(), expected.getColor());
    }


}

