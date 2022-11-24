package Generic_Count;

public class Odd_num<T> implements IProperties<Integer> {

    @Override
    public boolean check_property(Integer num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }
}



