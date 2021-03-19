import java.lang.Math;

public class MyMath
{
  /**
   * Returns true if num is a prime; otherwise returns false
   */
  public static boolean isPrime(int num)
  {
    if (num <= 1)
      return false;

    int m = 2;

    while (m * m <= num)
    {
      if (num % m == 0)
        return false;
      m++;
    }

    return true;
  }

   /**
   * Returns true if num is a perfect number, false otherwise
   */
  public static boolean isPerfect(int num) {
    int sum = 1;
    double sqrtNum = Math.sqrt(num);
    for(int n = 2; n <= sqrtNum; n++){
      if(num % n == 0){
        sum += n + num/n;
      }
    }
    if (sum == num){
      return true;
    } else{
      return false;
    }
  }

  /**
   * Prints the first 4 perfect numbers
   */
  public static void printFourPerfectNums()
  {
    int numsFound = 0;
    int num = 2;
    System.out.println("Perfect numbers:");
    while (numsFound < 4){
      if (isPerfect(num)){
        numsFound ++;
        System.out.print(num + " ");
      }
      num ++;
    }
    System.out.println();

  }

  /**
   * Prints the first 6 Mersenne primes and even perfect numbers
   */
  public static void printSixEvenPerfectNums()
  {
    int numsFound = 0;
    long n = 1;
    System.out.println("Even perfect numbers:");
    while (numsFound < 6){
      int power = (int)Math.pow(2, n);
      if (isPrime(power - 1)){
        long perfNum = (power - 1)*((long)Math.pow(2, n-1));
        System.out.println("Mersenne prime: " + (power - 1) + " Perfect number: " + perfNum);
        numsFound++;
      }
      n++;
    }

  }

  /*********************************************************************/

  public static void main(String[] args)
  {
    printFourPerfectNums();
    printSixEvenPerfectNums();
  }
}
