/**
 * Created by HP on 11.11.2016.
 */
public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle(1,2,3);
    Box box = new Box (1,2,3);
    Square square = new Square (1,2,3,2);

        System.out.println( circle.getArea());
        System.out.println( box.getArea());
        System.out.println( square.getArea());
}}
