package Assignment_1;

import java.util.Arrays;

public class Month {
    int month;

    Month(int month) {
        this.month = month;
    }

    private final Integer[] _31_Days = {1, 3, 5, 7, 8, 10};

    private final Integer[] _30_Days = {4, 6, 9, 11};

    public boolean _31Day_Month() {
        return Arrays.asList(_31_Days).contains(month);
    }

    public boolean _30Day_Month() {
        return Arrays.asList(_30_Days).contains(month);
    }

    public boolean December() {
        return month == 12;
    }

    public boolean February() {
        return month == 2;
    }

}
