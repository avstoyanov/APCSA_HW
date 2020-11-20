import java.util.Scanner;

public class Group3 {

    public static String fiveLine(int num){

        switch(num){
            case 1: case 2:
                return "Buckle your shoe";
            case 3: case 4:
                return "Shut the door";
            case 5: case 6:
                return "Pick up sticks";
            case 7: case 8:
                return "Lay them straight";
            case 9: case 10:
                return "A big fat hen";
            case 0:
                return "Bye!";
            default:
                return "Oops!";

        }
    }

    public static void main(String[] args) {
        int input = 1;
        while (input != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number 1-10 (or 0 to quit): ");
            input = scan.nextInt();
            scan.nextLine();
            System.out.println(fiveLine(input));
        }
    }
}
