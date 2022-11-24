package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Printer<E>
{
    public static <E> void PrintArray(E[] array)
    {
        for(E element : array)
        {
            System.out.printf("%s ", element);
            System.out.println();
        }

    }


    public static <E> String PrintList(List<E> list)
    {
        String line = "";

        for(E element : list)
        {
            line = line + element;
            line = line + "\n";
        }

        return line;
    }
}
