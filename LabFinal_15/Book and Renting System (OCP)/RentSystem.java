package Task2;

enum BookTypes {
    Regular, Kids, New
}


public class RentSystem
{
    private IRentCalculate calculate;

    public RentSystem(BookTypes type, String title, String author, int base_fee, int rent_days)
    {
        this.calculate = chooseBook(type , title, author, base_fee, rent_days);     // The factory method in use
    }

    public int rentCalculate()
    {
        return calculate.rentCalculate();
    }

    public IRentCalculate chooseBook(BookTypes type, String title, String author, int base_fee, int rent_days)
    {
        if (type.equals(BookTypes.Regular))
        {
            return new RegularBook(title, author, base_fee, rent_days);
        }

        else if (type.equals(BookTypes.Kids))
        {
            return new KidsBook(title, author, base_fee, rent_days);
        }

        else if(type.equals(BookTypes.New))
        {
            return new NewBook(title, author, base_fee, rent_days);
        }

        else
        {
            throw new IllegalArgumentException("Invalid.... ");
        }
    }

}
