package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator cal;

    @Before
    public void setup() {
        cal = new StringCalculator();
    }


    @Test
    public void nullOrEmptyStringAddTest() {
        String textNull = null;
        String textEmpty = "";
        Assert.assertEquals(0, cal.add(textNull));
        Assert.assertEquals(0, cal.add(textEmpty));
    }

    @Test
    public void splitStringTest() {
        String expected14 = "3,5,6";
        String expected19 = "1,5,6:7";
        Assert.assertEquals(14, cal.add(expected14));
        Assert.assertEquals(19, cal.add(expected19));
    }

    @Test
    public void tempTest() {
        String temp = "3;1;2";
    }
}
