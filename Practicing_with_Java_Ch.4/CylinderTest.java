/**
 * Created by Alexander Stoyanov on 10/22/20.
 * Program Description: tests Cylinder class
 */
import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter radius: ");
        double r = scan.nextDouble();
        scan.nextLine();
        System.out.print("enter height: ");
        double h = scan.nextDouble();
        scan.close();
        Cylinder cylinder = new Cylinder(r, h);
        System.out.println(cylinder.getVolume());
    }
}
