package org.example;

public class FizzBuzz
{
    public String getFizzyBuzz(int n)
    {
        String s;

        if( n%3 == 0 )
        {

            if( n%7 == 0 )
            {
                s= "FizzBuzz";
            }

            else
            {
                s = "Fizz";
            }

        }

        else if( n%7==0 )
        {
            s = "Buzz";
        }

        else
        {
            s= "Gotcha";
        }

        return s;
    }
}
