package org.example;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.Stack;

public class MinStack
{
        Stack<Integer> stack = new Stack<>();

        List<Integer> mininmumList = new ArrayList<>();

        Integer min = 1000000000;


        public void push(Integer value)
        {
            stack.push(value);

            if( value < min )
            {
                min = value;
                mininmumList.add(value);
            }

        }


        public void pop()
        {
            if( mininmumList.size() != 1  &&  stack.peek() == mininmumList.get((mininmumList.size() - 1) ))
            {
                mininmumList.remove((mininmumList.size() - 1) );
            }

            stack.pop();
        }


        public void showStack()
        {
            System.out.println(stack);
        }


        public Integer getMin()
        {
            Integer smallest = mininmumList.get( (mininmumList.size() - 1) );
            return smallest;
        }

}
