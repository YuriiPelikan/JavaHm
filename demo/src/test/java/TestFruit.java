import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestFruit {

        @Test
        public void inputTest() {
            Fruit actual = new Fruit();
            Fruit expected = new Fruit("grape","green");
            actual.setName("grape");
            actual.setColor("green");
            //Assert.assertEquals(actual result, expected result);
            Assert.assertEquals(actual.getName(),expected.getName());
            Assert.assertEquals(actual.getColor(),expected.getColor());
        }


}

