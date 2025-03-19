package others;

/**
 * Print fibonacci numbers up to a given number.
 * fibonacci number  in any given position is obtained  by adding previous two numbers
 * Example : f0=0,f1=1, f2=1, Ff3=2,f4=3 etc
 */

public class Fibonacci {

    public static void main (String argv[]){

        int printFibnacciUpto = 5; //example
        for(int i=0;i<= printFibnacciUpto;i++ ) {
            System.out.println( fibonacci(i));
        }

    }

    /**
     * Prints fibonacci of a given number by recursing and adding the previous two numbers
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else if (n >= 2) {
            return fibonacci(n -1)+ fibonacci(n - 2);
        }
        return 0;
    }
}
