package Generic_Count;

public class Div_by_3<T> implements IProperties<Integer>
{

    @Override
    public boolean check_property(Integer num)
    {
        if(num%3 == 0){
            return true;
        }

        else{
            return false;
        }

    }
}


