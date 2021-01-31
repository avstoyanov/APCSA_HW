/**
 * Created by sasho on 10/7/20.
 * Program Description:
 * Resources Used:
 * Worked With:
 */
import java.lang.Math;
import java.util.Scanner;

public class MathProbs {
    public static double triangleArea(double a, double b, double c){
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }


    public static void main(String[] args) {
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter the three sides each on separate lines");
        double side1 = Double.parseDouble(sides.nextLine());
        double side2 = Double.parseDouble(sides.nextLine());
        double side3 = Double.parseDouble(sides.nextLine());
        System.out.println(triangleArea(side1, side2, side3));
    }

}
