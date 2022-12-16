package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RentSystemTest {

    @Test
    public void RegularBookRentCalculate()
    {
        RentSystem rentSystem = new RentSystem(BookTypes.Regular, "Title", "MAK", 10, 7);
        int value = rentSystem.rentCalculate();
        assertEquals(8, value);
    }

    @Test
    public void KidsBookRentCalculate()
    {
        RentSystem rentSystem = new RentSystem(BookTypes.Kids, "Title", "MAK", 10, 7);
        int value = rentSystem.rentCalculate();
        assertEquals(9, value);
    }

    @Test
    public void NewBookRentCalculate()
    {
        RentSystem rentSystem = new RentSystem(BookTypes.New, "Title", "MAK", 10, 7);
        int value = rentSystem.rentCalculate();
        assertEquals(13, value);
    }


    @Test
    public void RegularBookRentCalculateWithFine()
    {
        RentSystem rentSystem = new RentSystem(BookTypes.Regular, "Title", "MAK", 10, 8);
        int value = rentSystem.rentCalculate();
        assertEquals(12 , value);
    }



    @Test
    public void KidsBookRentCalculateWithFine()
    {
        RentSystem rentSystem = new RentSystem(BookTypes.Kids, "Title", "MAK", 10, 8);
        int value = rentSystem.rentCalculate();
        assertEquals(13 , value);
    }

    @Test
    public void NewBookRentCalculateWithFine()
    {
        RentSystem rentSystem = new RentSystem(BookTypes.New, "Title", "MAK", 10, 8);
        int value = rentSystem.rentCalculate();
        assertEquals(17 , value);
    }


}