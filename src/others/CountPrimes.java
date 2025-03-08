package others;

/*
 *   Count Number of Primes below a given number
 *   A prime number is a number divisible only by 1 or itself (do remember 0 and 1 are  Not Primes)
 *   Algorithm  : with Sieve of Erastosthenes : Logic - increment the numbers till squareroot of n
 *   and the mark all multiples in an array corresponding to the number.. This way instread of
 *   finding prime you discard non primes and rest would be a prime.
 *   Build and arry with n elements, assume 0 in the array  is a prime and  assume 1 in the array  is  NOT a primes
 *   Logic - increment the numbers till squareroot of n and the mark all multiples in the array
 *   as non primes in the array
 *
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
