package org.example;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    public Journal()
    {

    }

    private List<String> entries = new ArrayList<String>();

    public void setEntry(String s)
    {
        entries.add(s);
    }

    public void setEntry(List<String> strings)
    {

        for(int i=0 ; i<strings.size() ; i++)
        {
            entries.add(strings.get(i));
        }
    }

    @Override
    public String toString()
    {
        return "";
    }

}


