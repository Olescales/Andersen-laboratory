package lab.andersen.katokoleg.recursion;

/**
 * @author Katok Oleg on 11.01.2021
 */
public class Fibonacci {

    /**
     * @param position - order number of fibonacci digit
     * @return fibonacci number on definite position
     */
    public int getFibonacciNumber (int position) {
        if (position <= 0) {
            throw new IllegalArgumentException();
        }
        if (position == 1) {
            return 0;
        } else if (position == 2) {
            return 1;
        } else {
            return getFibonacciNumber(position - 1) + getFibonacciNumber(position - 2);
        }
    }
}

