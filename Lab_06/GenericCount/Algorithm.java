package Generic_Count;

import java.util.ArrayList;
import java.util.List;


public class Algorithm
{

    public static <T> int CountIf(List<T> list, IProperties<T> property)
    {
        int count=0;

        for(T obj : list)
        {
            if( property.check_property(obj) )
            {
                count++;
            }
        }


        return count;
    }




    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        List<String> s_list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);

        s_list.add("Alice");
        s_list.add("Bod");

        Div_by_3 div_by_3 = new Div_by_3();

        Odd_num odd = new Odd_num();

        String_length string_length = new String_length();

        System.out.println(Algorithm.CountIf(list, div_by_3));

        System.out.println(Algorithm.CountIf(list, odd));

        System.out.println(Algorithm.CountIf(s_list, string_length));

    }


}


