package Generic_Count;

public class String_length<T> implements IProperties<String> {

    @Override
    public boolean check_property(String string) {

        if(string.length() > 4)
        {return true;}

        else return false;
    }
}
