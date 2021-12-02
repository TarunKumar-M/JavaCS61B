/** Class that prints the Collatz sequence starting from a given number.
 *  @author Tarun Kumar
 */
public class Collatz {

    /** Returns next number of Collatz sequence
     *  Returns n/2 if number is even
     *  Returns 3n+1 if number is odd
     *  Valid for non */
    public static int nextNumber(int n) {
        if (n  < 1) {
            return 1;
        } else if (n % 2 != 0) {
            return 3 * n + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

