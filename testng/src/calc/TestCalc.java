package calc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {
    private Calc calc = new Calc();

    @Test
    public void testCount() throws Exception {

        Assert.assertEquals(8, calc.sum(4, 2));
    }

}
