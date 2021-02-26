/**
 * Created by Alex on 11/23/20.
 * Program Description:
 */
import java.util.Scanner;

public class PracticeProblems {
    //PROBLEM 1: STAR TRIANGLE
    public static void printStarTriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    } //PROBLEM 1 END

    //PROBLEM 2: CHECKERBOARD
    public static void printCheckerboard(int n){
        int p = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(p%2 == 0){
                    System.out.print("#");
                } else{
                    System.out.print("o");
                }
                p++;
            }
            System.out.println();
            if(n%2 == 0){
                p++;
            }
        }
    } //PROBLEM 2 END

    //PROBLEM 3: COIN REPRESENTATIONS
    public static void coinReps(int cents){
        int combinations = 0;
        for(int q = 0; q <= cents/25; q++){

            for(int d = 0; d <= (cents - 25*q)/10; d++){

                for(int n = 0; n <= (cents - 25*q - 10*d)/5; n++){

                    int p = (cents - 25*q - 10*d - 5*n);
                    System.out.println(cents+" cents = "+q+" quarters + "+d+" dimes + "+n+" nickels + "+p+" pennies");
                    combinations++;
                }
            }
        }
        System.out.println();
        System.out.println("Total representations: "+combinations);
    } //PROBLEM 3 END

    //PROBLEM 4 RIPPLES
    public static void ripples(){
        final double ripplePrice = 0.26;

        Scanner scan = new Scanner(System.in);
        char customer = ' ';
        int quantity;

        while(customer != 'n'){
            System.out.print("Enter quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
            if(quantity%25 == 0){
                System.out.printf("You have ordered %d Ripples -- $%.2f\n\n", quantity, ripplePrice*quantity);
            } else{
                System.out.println("Ripples can be ordered only in packs of 25.\n");
            }
            customer = ' ';
            while(customer != 'y' && customer != 'n') {
                System.out.print("Next customer (y/n): ");
                String str = scan.nextLine().trim();
                if (str.length() ==1 && (str.charAt(0) == 'y' || str.charAt(0) == 'n')) {
                    customer = str.charAt(0);
                    System.out.println();
                } else {
                    customer = ' ';
                }
            }
        }
        System.out.println("Thank you for using the Ripple System.");
    }



    public static void main(String[] args) {
        printStarTriangle(6);
        System.out.println();
        printCheckerboard(8);
        System.out.println();
        coinReps(25);
        System.out.println();
        ripples();
    }
}
