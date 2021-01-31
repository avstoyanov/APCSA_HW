import java.util.Scanner;
/**
 * Created by sasho on 10/6/20.
 * Program Description:
 * Resources Used:
 * Worked With:
 */
public class LunchTime {
    public static int minutesUntilLunch(int hours, int minutes) {
        return (12 - hours)*60 + 60 - minutes;
    }

    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Enter the current time: ");
        String curTime = time.nextLine();
        int i = curTime.indexOf(":");
        int hours = Integer.parseInt(curTime.substring(0, i));
        int mins = Integer.parseInt(curTime.substring(i+1));
        System.out.println(minutesUntilLunch(hours, mins));

    }


}
