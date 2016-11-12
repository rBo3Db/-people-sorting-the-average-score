/**
 * Created by HP on 12.11.2016.
 */
public class Square extends Figure {
    double sideOne;
    double sideTwo;
    public Square(int x, int y, double sideOne, double sideTwo) {
        super(x, y);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        double result = sideOne*sideTwo;
        return result;
    }
}
