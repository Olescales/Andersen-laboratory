package lab.andersen.katokoleg.recursion;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test (expected = IllegalArgumentException.class)
    public void getFibonacciNumberZeroThrowsException() {
        int expected = Fibonacci.getFibonacciNumber(0);
    }


    @Test
    public void getFibonacciNumberOne() {
        int expected = Fibonacci.getFibonacciNumber(1);
        Assert.assertEquals(0, expected);
    }

    @Test
    public void getFibonacciNumberSeven() {
        int expected = Fibonacci.getFibonacciNumber(7);
        Assert.assertEquals(8, expected);
    }

    @Test
    public void getFibonacciNumberTwenty() {
        int expected = Fibonacci.getFibonacciNumber(20);
        Assert.assertEquals(4181, expected);
    }
}