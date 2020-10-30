/**
 * Created by Alexander Stoyanov on 10/22/20.
 * Program Description: creates a Circle class
 */
import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double r){
        radius = r;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
