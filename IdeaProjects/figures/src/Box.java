/**
 * Created by HP on 12.11.2016.
 */
public class Box extends Figure {
    public Box(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }

    double side;

    @Override
    public double getArea() {

        double result = side*side;
        return result;
    }
}
