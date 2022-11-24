package org.example;
import org.junit.Test;

import static org.junit.Assert.*;


public class MinStackTest {


    @Test
    public void getMinAfterPushing_3_2_5_1()
    {
        MinStack minStack  = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);

        Integer num  = 1;

        assertEquals(num, minStack.getMin());


    }

    @Test
    public void getMinAfterPushing_3_2_5_1_thenPop()
    {
        MinStack minStack  = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);

        minStack.pop();

        Integer num  = 2;

        assertEquals(num, minStack.getMin());

    }

    @Test
    public void getMinAfterPushing_12_3_4()
    {
        MinStack minStack  = new MinStack();
        minStack.push(12);
        minStack.push(3);
        minStack.push(4);

        Integer num = 3;

        assertEquals(num, minStack.getMin());
    }

}