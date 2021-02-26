/**
 * Created by Alex on 11/19/20.
 * Program Description:
 */

public class Prime {
    /**
     * Returns true if n is a prime; otherwise returns false
     */
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;

        int m = 2;

        while (m * m <= n){
            if (n % m == 0) {
                System.out.println(m);
                return false;
            }
            m += 1 + (m==2 ? 0 : 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1080014003));
    }
}
