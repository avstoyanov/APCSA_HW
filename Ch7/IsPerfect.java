/**
 * Created by Alex on 11/19/20.
 * Program Description:
 */

public class IsPerfect {
    public static boolean isPerfectSquare(int n){
        if (n > 0) {
            int i = 1;
            int j = 1;
            while (j < n) {
                i += 2;
                j += i;
            }
            if (j == n) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 1045231 * 1045231;
        System.out.println(n);
        System.out.println(isPerfectSquare(n));
    }
}
