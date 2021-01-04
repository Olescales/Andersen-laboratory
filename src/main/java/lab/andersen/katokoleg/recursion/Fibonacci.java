package lab.andersen.katokoleg.recursion;

public class Fibonacci {

    public static int getFibonacciNumber (int depth) {
        if (depth <= 0) {
            throw new IllegalArgumentException();
        }

        if (depth == 1) {
            return 0;
        } else if (depth == 2) {
            return 1;
        } else {
            return getFibonacciNumber(depth - 1) + getFibonacciNumber(depth - 2);
        }
    }
}

