package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class GenericMaxStackTest {

    @Test
    public void push_3_2_5()
    {
            GenericMaxStack<Integer> maxStack  = new GenericMaxStack();
            maxStack.push(3);
            maxStack.push(2);
            maxStack.push(5);

            Integer expected = 5;

            assertEquals(expected, maxStack.getMax());
    }

    @Test
    public void push_2_1_2_5()
    {
        GenericMaxStack<Integer> maxStack  = new GenericMaxStack();
        maxStack.push(2);
        maxStack.push(1);
        maxStack.push(7);
        maxStack.push(5);

        System.out.println(maxStack.getMax());

        maxStack.pop();

        System.out.println(maxStack.getMax());

        Integer expected = 7;

        assertEquals(expected, maxStack.getMax());

    }

    @Test
    public void push_doubles()
    {
        GenericMaxStack<Double> maxStack  = new GenericMaxStack();
        maxStack.push(49.75);
        maxStack.push(12.25);
        maxStack.push(23.54);

        maxStack.showStack();

        maxStack.pop();

        maxStack.showStack();

        Double expected = 49.75;

        assertEquals(expected, maxStack.getMax());

    }


    @Test
    public void push_strings()
    {
        GenericMaxStack<String> maxStack  = new GenericMaxStack();
        maxStack.push("OOC is bad");
        maxStack.push("Nothing to understand");
        maxStack.push("Try hard");

        assertEquals("Try hard", maxStack.getMax());

    }

    @Test
    public void push_strings_2()
    {
        GenericMaxStack<String> maxStack  = new GenericMaxStack();
        maxStack.push("OOC is bad");
        maxStack.push("Nothing to understand");
        maxStack.push("Try hard");

        maxStack.pop();

        assertEquals("OOC is bad", maxStack.getMax());

    }


}