/**
 * Created by HP on 12.11.2016.
 */
public class Circle extends Figure {
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    double radius;
    @Override
    public double getArea() {
        double result = radius*radius*2*3.14;
        return result;
    }
}
