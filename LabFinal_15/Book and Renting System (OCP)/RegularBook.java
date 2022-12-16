package Task2;

public class RegularBook extends Book implements IRentCalculate {

    RegularBook(String title, String author, int base_fee, int rent_days) {
        super(title, author, base_fee, rent_days);
    }

    @Override
    public int rentCalculate() {
        base_fee = (int) (base_fee - (base_fee * .2));

        if (rent_days <= 7) {
            return base_fee;
        } else {
            return base_fee + (rent_days - 7) * 4;
        }

    }
}
