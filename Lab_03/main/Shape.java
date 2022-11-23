package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Shape
{
    public abstract String Draw();

}


class Circle extends Shape
{
    public String Draw()
    {
        return "circle\n";
    }
}

class Square extends Shape
{
    public String Draw()
    {
        return "square\n";
    }
}


class Rectangle extends Shape
{
    public String Draw() { return "rectangle\n"; }
}


/*public class Shape {
    ArrayList<String> shapes = new ArrayList<>(Arrays.asList("circle", "square"));

    public void addShape()
    {
        shapes.add("rectangle");
    }

    public String drawingOneCircle()
    {
        return "circle\n";
    }

    public String drawingOneSquare()
    {
        return "Square\n";
    }

    public String drawingCircle(int n)
    {
        String line="";

        for(int i=0 ; i<n ; i++)
        {
            line = line + "circle\n";
        }
        return line;
    }

    public String drawingSquare(int n)
    {
        String line="";

        for(int i=0 ; i<n ; i++)
        {
            line = line + "square\n";
        }
        return line;
    }

    public String drawingRectangle(int n)
    {
        String line="";

        for(int i=0 ; i<n ; i++)
        {
            line = line + "rectangle\n";
        }
        return line;
    }

    public String drawingMultipleShapes(int circle, int square)
    {
        return drawingCircle(circle) + drawingSquare(square);
    }

}*/
