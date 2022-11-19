package Assignment_2.ContentCoupling;


// Example of Content Coupling
public class Square {

    public void setName(Shape shape)
    {
        shape.name = "Square";        // changing the value of an attribute since it's public
    }


    public static void main(String[] args) {

        Shape shape = new Shape();
        Square square = new Square();

        shape.getName();
        square.setName(shape);          //  example of Content Coupling
        shape.getName();
    }
}
