/**
 * Created by Alexander Stoyanov on 10/22/20.
 * Program Description: tests the circle class
 */
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double radius;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the radius of the circle: ");
        radius = scan.nextDouble();
        scan.close();
        Circle circle = new Circle(radius);
        System.out.println(circle.getArea());
    }
}
