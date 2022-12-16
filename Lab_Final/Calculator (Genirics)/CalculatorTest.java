package Task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        double expected = 7;
        double actual = calculator.add(5.5, 1.5);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        double expected = 4;
        double actual = calculator.subtract(5.5, 1.5);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        double expected = 8.25;
        double actual = calculator.multiply(5.5, 1.5);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double expected = 3.66665;
        double actual = calculator.divide(5.5, 1.5);

        assertEquals(expected, actual, 0.01);
    }
}