package calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
        System.out.println("setup");
    }

    @After
    public void teardown() {
        System.out.println("teardown");
    }

    @Test
    public void add() {
        assertEquals(7, calculator.add(3, 4));
        System.out.println("add");
    }

    @Test
    public void subtract() {
        assertEquals(4, calculator.subtract(7, 3));
        System.out.println("subtract");
    }

    @Test
    public void multiply() {
        assertEquals(12, calculator.multiply(3, 4));
        System.out.println("multiply");
    }

    @Test
    public void divide() {
        assertEquals(3, calculator.divide(12, 4));
        System.out.println("divide");
    }
}
