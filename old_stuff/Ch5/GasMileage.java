// Chapter 5 Question 18

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage
{
    public static double gasMileage(int milesCalc, double mpgallonsCalc)
    {
        return milesCalc/mpgallonsCalc;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Miles traveled: ");
        int miles = input.nextInt();
        System.out.print("Miles per gallon: ");
        double mpgallon = input.nextDouble();

        input.close();

        double mpg = gasMileage(miles, mpgallon);
        System.out.println("Your car's gas mileage was " + mpg + " miles per gallon\n");
    }
}
