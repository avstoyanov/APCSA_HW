public class Sieve {
    private static int primeCount = 0;
    private static long execTime;

    public static int[] sieve(int l){
        final long startTime = System.currentTimeMillis();
        /*
        short variables in order of occurrence:
        l = Length, or the Last number to test
        len = length of Primes array
        pC = primeCount
        n = current Number in isPrime
        m = Multiple
        ***************
        instead of setting all values to true in the array and then setting non-primes to false,
        I do the opposite to conserve both memory and time, since in this way I do not have to
        set the values myself. When the array is initialized, all values are false by default.
        ***************
        Memory efficient version below
         */
        if(l < 2){
            System.out.println("None");
            primeCount = 0;
            final long endTime = System.currentTimeMillis();
            execTime = endTime-startTime;
            int[] primes = {};
            return primes;
        }

        l++;
        boolean[] isPrime = new boolean[l];
        int len = l<37 ? (l+1)/2 : (l-1)/3;
        int[] primes = new int[len];
        int pC = 0;
//        isPrime[0]=true;
//        isPrime[1]=true;
        for(int n = 2; n < l; n+=2) {
            if (isPrime[n] != true) {
                primes[pC] = n;
                pC++;
            }
            if (n <= l / 2) {
                for (int m = 2*n; m < l; m += n) {
                    isPrime[m] = true;
                }
            }
            if(n == 2){
                n--;
            }
        }

        final long endTime = System.currentTimeMillis();
        execTime = endTime-startTime;
        primeCount = pC;
        return primes;
    }

    public static int[] sieveMem(int l){
        final long startTime = System.currentTimeMillis();
        /*
        This is the memory efficient version of the first sieve, meaning that it works in the same
        way but faster and using less memory. It still stores all the primes found in a separate
        array for later use, and printing is optional. This is the fastest option.
        It will store an (l-1)/2+1 length boolean array, and an additional (2*l)/3 length int array
        for l values over 18.
         */
        if(l < 2){
            System.out.println("None");
            primeCount = 0;
            final long endTime = System.currentTimeMillis();
            execTime = endTime-startTime;
            int[] primes = {};
            return primes;
        }

        l = (l-1)/2;
        boolean[] isPrime = new boolean[l+1];
        int len = l<18 ? (l+1) : (2*l)/3;
        int[] primes = new int[len];
        primes[0] = 2;
        int pC = 1;
//        isPrime[0]=true;
//        isPrime[1]=true;
        for(int n = 1; n <= l; n++) {
            if (isPrime[n] != true) {
                primes[pC] = 2*n+1;
                pC++;
            }
            if (n <= l / 2) {
                for (int m = 3*n + 1; m < l+1; m += 2*n+1) {
                    isPrime[m] = true;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        execTime = endTime-startTime;
        primeCount = pC;
        return primes;
    }

    public static void sieveMemUltra(int l){
        final long startTime = System.currentTimeMillis();
        /*
        This is the most memory efficient version. It only initializes the number of indices needed,
        and it loops accordingly. It does not store any of the values found in a list of primes,
        but instead it prints them directly. It will store a (l-1)/2+1 length boolean array, a few ints,
        and will only run one nested loop, a total of two loops.
         */
        if(l < 2){
            System.out.println("None");
            primeCount = 0;
            final long endTime = System.currentTimeMillis();
            execTime = endTime-startTime;
            return;
        }

        l = (l-1)/2;
        boolean[] isPrime = new boolean[l+1];
        int pC = 1;
        int format = (l+"").length()+1;
        int count = 0;
//        isPrime[0]=true;
//        isPrime[1]=true;
        for(int n = 1; n <= l; n++) {
            if (isPrime[n] != true) {
                pC++;
                count = printCurrentPrime(format, 2*n + 1, count);
            }
            if (n <= l / 2) {
                for (int m = 3 * n + 1; m < l + 1; m += 2 * n + 1) {
                    isPrime[m] = true;
                }
            }
        }
        System.out.println();
        primeCount = pC;
        final long endTime = System.currentTimeMillis();
        execTime = endTime-startTime;
        return;
    }

    public static int printCurrentPrime(int format, int num, int count){
        System.out.printf("%" + format + "s", num);
        count ++;
        if(count == 5) {
            System.out.println();
            return 0;
        } else {
            return count;
        }
    }
    public static void printPrimes(int[] primeArray){
        if(primeArray.length == 0){
            return;
        }
        int format = (primeArray[primeCount-1]+"").length()+1;
        int count = 0;
        for(int p = 0; p < primeCount; p++){
            if(count == 5){
                System.out.println();
                count = 0;
            }
            count++;
            System.out.printf("%" + format + "s", primeArray[p]);
        }
        System.out.println();
    }

    public static int getPC(){
        return primeCount;
    }
    public static long getTime(){
        return execTime;
    }
    public static void main(String[] args) {
//          sieveMemUltra(10000000);
//        System.out.println(getPC());
//        System.out.println(getTime());
        //printPrimes(sieve1(100000000));
//          sieve(10000000);
//        System.out.println(getPC());
//        System.out.println(getTime());
        //printPrimes(sieveMem(100000000));
        sieveMem(1000000000);
        System.out.println(getPC());
        System.out.println(getTime());
    }
}
