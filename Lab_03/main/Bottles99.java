package org.example;

public class Bottles99
{
    public String singleVerse(int n)
    {
        String line;

        if( n > 99  ||  n < 0 )
        {
            return "WRONG";
        }

        else if(n == 0)
        {
            line = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
        }

        else if( n == 1 )
        {
            line = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.\n";
        }

        else if( n == 2 )
        {
            line =  "2" + " bottles of beer on the wall, " + "2" + " bottles of beer.\n" +
                    "Take one down and pass it around, " + "1" + " bottle of beer on the wall.\n";
        }

        else
        {
            line = n + " bottles of beer on the wall, " + n + " bottles of beer.\n" +
                    "Take one down and pass it around, " + (n-1) +  " bottles of beer on the wall."  ;
        }

        return line;
    }


    public String rangedVerses(int first, int last)
    {
        String rangedLine = "";

        for(int i=first ; i>=last ; i--)
        {
            rangedLine = rangedLine + singleVerse(i);
        }
        return rangedLine;
    }


    public String fullSong()
    {
        return rangedVerses(99, 0);
    }

}
