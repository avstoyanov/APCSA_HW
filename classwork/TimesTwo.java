import java.util.Scanner;

public class TimesTwo {

    public static void main(String[] args){
        Scanner integer = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int userInt = integer.nextInt();
        integer.nextLine();


        System.out.println("2 * " + userInt +" = " + 2*userInt);
        integer.close();
    }

}
