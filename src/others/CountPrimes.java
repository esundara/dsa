package others;

/*
 *   Count Primes
 *   Algorithm  : with Sieve of Erastosthenes
 *   prime number is divisible only by 1 or itself
 *   assume 0 in the array  =  prime
 *   assume 1 in the array  =  NOT prime
 */
public class CountPrimes {


    public static void main(String argv[]) {

        int sampleNumber = 10;
        int count = countPrime(sampleNumber);
        System.out.println("\nPrime Count = " + count);
    }

    public static int countPrime(int n) {
        // since 0, 1 are Non Primes.
        if (n < 2) return 0;

        int PRIME = 0;
        int NOT_PRIME = 1;

        int prime[] = new int[n];


        for (int outer_counter = 2; outer_counter * outer_counter <= n; outer_counter++) {
            if (prime[outer_counter] == PRIME) {
                for (int squareOfCurrentNumber = outer_counter * outer_counter; squareOfCurrentNumber < n; squareOfCurrentNumber = squareOfCurrentNumber + outer_counter) {
                    prime[squareOfCurrentNumber] = NOT_PRIME;
                }
            }

        }
        print(prime);

        int result = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i] == 0) result++;
        }
        return result;

    }

    public static void print(int[] prime) {
        for (int i = 0; i < prime.length; i++) {
            System.out.print(prime[i] + ",");
        }
    }
}
