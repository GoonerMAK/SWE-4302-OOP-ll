package Task4;

import Task2.Book;
import Task3.Calculator;
import org.junit.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class ReflectionTest {

    @Test
    public void CheckSuperClass()
    {
        Class book = Book.class;
        assertEquals(book.getSuperclass(), Object.class);
    }

    @Test
    public void AbstractTest()
    {
        Class calcClass = Calculator.class;

        int modifier = calcClass.getModifiers();
        assertFalse(Modifier.isAbstract(modifier));
    }

}