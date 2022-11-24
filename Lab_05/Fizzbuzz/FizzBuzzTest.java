package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest
{

    @Test
    public void CheckingDivisibilityBy3()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "Fizz";

        assertEquals(expected, fizzBuzz.getFizzyBuzz(3));
    }


    @Test
    public void CheckingDivisibilityBy7()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "Buzz";

        assertEquals(expected, fizzBuzz.getFizzyBuzz(7));
    }


    @Test
    public void CheckingDivisibilityBy3and7()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "FizzBuzz";

        assertEquals(expected, fizzBuzz.getFizzyBuzz(21));
    }


    @Test
    public void CheckingNoDivisibility()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "Gotcha";

        assertEquals(expected, fizzBuzz.getFizzyBuzz(5));
    }

}