package Assignment_1;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestDate
{

    @Test
    public void test_01()
    {
        int day = 31; int month = 1; int year = 2020;

        String expected = "1/2/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d._31stDay() && m._31Day_Month() )  { day = 1; month++; }

        else if( d._30thDay() && m._30Day_Month() )  { day = 1; month++; }

        else if(d._31stDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.LeapYear())
            {
                if(d._29thDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.LeapYear() )
            {  if(d._28thDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


    @Test
    public void test_02()
    {
        int day = 30; int month = 4; int year = 2020;

        String expected = "1/5/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d._31stDay() && m._31Day_Month() )  { day = 1; month++; }

        else if( d._30thDay() && m._30Day_Month() )  { day = 1; month++; }

        else if(d._31stDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.LeapYear())
            {
                if(d._29thDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.LeapYear() )
            {  if(d._28thDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


    @Test
    public void test_03()
    {
        int day = 28; int month = 2; int year = 2020;

        String expected = "29/2/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d._31stDay() && m._31Day_Month() )  { day = 1; month++; }

        else if( d._30thDay() && m._30Day_Month() )  { day = 1; month++; }

        else if(d._31stDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.LeapYear())
            {
                if(d._29thDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.LeapYear() )
            {  if(d._28thDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }



    @Test
    public void test_04()
    {
        int day = 29; int month = 2; int year = 2020;

        String expected = "1/3/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d._31stDay() && m._31Day_Month() )  { day = 1; month++; }

        else if( d._30thDay() && m._30Day_Month() )  { day = 1; month++; }

        else if(d._31stDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.LeapYear())
            {
                if(d._29thDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.LeapYear() )
            {  if(d._28thDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


    @Test
    public void test_05()
    {
        int day = 28; int month = 2; int year = 2022;

        String expected = "1/3/2022";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d._31stDay() && m._31Day_Month() )  { day = 1; month++; }

        else if( d._30thDay() && m._30Day_Month() )  { day = 1; month++; }

        else if(d._31stDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.LeapYear())
            {
                if(d._29thDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.LeapYear() )
            {  if(d._28thDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


    @Test
    public void test_06()
    {
        int day = 15; int month = 7; int year = 2020;

        String expected = "16/7/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d._31stDay() && m._31Day_Month() )  { day = 1; month++; }

        else if( d._30thDay() && m._30Day_Month() )  { day = 1; month++; }

        else if(d._31stDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.LeapYear())
            {
                if(d._29thDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.LeapYear() )
            {  if(d._28thDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


    @Test
    public void test_07()
    {
        int day = 31; int month = 12; int year = 2020;

        String expected = "1/1/2021";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d._31stDay() && m._31Day_Month() )  { day = 1; month++; }

        else if( d._30thDay() && m._30Day_Month() )  { day = 1; month++; }

        else if(d._31stDay() && m.December())  { day = 1; month = 1; year++; }

        else if(m.February())
        {
            if(y.LeapYear())
            {
                if(d._29thDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.LeapYear() )
            {  if(d._28thDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


}