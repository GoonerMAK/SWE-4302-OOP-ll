package Task3;

public interface Operation<T extends Number>
{
    T add(T a, T b);

    T subtract(T a, T b);

    T multiply(T a, T b);

    T divide(T a, T b);

}


