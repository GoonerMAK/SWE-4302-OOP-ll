package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShapeTest {

    @Test
    public void shapesTest()
    {
        ArrayList<Shape> shapesList = new ArrayList<>();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();

        shapesList.add(rectangle);
        shapesList.add(square);
        shapesList.add(circle);


        for(Object shape : shapesList)     // here shape is every object that is in the shapesList
        {
            System.out.println();
            assertTrue(shape instanceof Shape);
        }
    }

}



/*@Test
    public void circleTwoTimesTest()
    {
        Shape shape = new Shape();

        String expected = "circle\n" + "circle\n";

        assertEquals(expected, shape.drawingCircle(2));
    }

    @Test
    public void drawingSquareTest()
    {
        Shape shape = new Shape();

        String expected = "square\n";

        assertEquals(expected, shape.drawingSquare(1));

    }


    @Test
    public void testingSequence()
    {
        Shape shape = new Shape();

        String expected = "circle\n" +
                "circle\n" +
                "square\n" +
                "square\n" +
                "square\n";

        assertEquals(expected, shape.drawingMultipleShapes(2, 3));
    }



    @Test
    public void drawingRectangleTest()
    {
        Shape shape = new Shape();

        String expected = "rectangle\n";

        assertEquals(expected, shape.drawingRectangle(1));
    }


    @Test
    public void allSequence()
    {
        Shape shape = new Shape();

        String expected = "circle\n" + "square\n";
        String str = "";


        for( String s : shape.shapes )
        {
            str = str + s + "\n";
        }

        assertEquals(expected, str);
    }*/