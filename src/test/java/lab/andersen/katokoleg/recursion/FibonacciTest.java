package lab.andersen.katokoleg.recursion;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test (expected = IllegalArgumentException.class)
    public void getFibonacciNumberZeroThrowsException() {
        Fibonacci fibonacci = new Fibonacci();
        int expected = fibonacci.getFibonacciNumber(0);
    }


    @Test
    public void getFibonacciNumberOne() {
        Fibonacci fibonacci = new Fibonacci();
        int expected = fibonacci.getFibonacciNumber(1);
        Assert.assertEquals(0, expected);
    }

    @Test
    public void getFibonacciNumberSeven() {
        Fibonacci fibonacci = new Fibonacci();
        int expected = fibonacci.getFibonacciNumber(7);
        Assert.assertEquals(8, expected);
    }

    @Test
    public void getFibonacciNumberTwenty() {
        Fibonacci fibonacci = new Fibonacci();
        int expected = fibonacci.getFibonacciNumber(20);
        Assert.assertEquals(4181, expected);
    }
}