package org.example;

import java.util.*;
import java.util.Stack;

public class GenericMaxStack<T extends Comparable>
{
    Stack<T> stack = new Stack<>();

    List<T> maximumList = new ArrayList<>();

    private T max;

    public void push(T num)
    {
        stack.push(num);

        if(stack.size() == 1)
        {
            max = num;
            maximumList.add(num);
        }

        if(num.compareTo(max) > 0)
        {
            max = num;
            maximumList.add(num);
        }

    }


    public void pop()
    {
        if( maximumList.size() != 1  &&  (stack.peek() == maximumList.get(maximumList.size() - 1)) )
        {
            maximumList.remove(maximumList.size() - 1);
        }

        stack.pop();

    }


    public void showStack()
    {
        System.out.println(stack);
    }


    public T getMax()
    {
        if(maximumList.size() == 0)
        {
            return maximumList.get(0);
        }

        else
        {
            T maximum = maximumList.get(maximumList.size() - 1);
            return maximum;
        }

    }

}
