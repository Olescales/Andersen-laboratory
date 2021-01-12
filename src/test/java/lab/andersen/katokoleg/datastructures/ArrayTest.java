package lab.andersen.katokoleg.datastructures;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayTest {

    @Test
    public void getSecondMinElementMixValues() {
        int[] source = {-1, 5, -10, 5, 3, 8, -11};
        Array array = new Array();
        int secondMinElement = array.getSecondMinElement(source);
        Assert.assertEquals(-10, secondMinElement);
    }

    @Test
    public void getSecondMinElementPosValues() {
        int[] source = {123, 0, 1254, 12, 3, 8, 56};
        Array array = new Array();
        int secondMinElement = array.getSecondMinElement(source);
        Assert.assertEquals(3, secondMinElement);
    }

    @Test
    public void getSecondMinElementNegValues() {
        int[] source = {-123, -5, -1254, -12, -3, -25, -1};
        Array array = new Array();
        int secondMinElement = array.getSecondMinElement(source);
        Assert.assertEquals(-123, secondMinElement);
    }

    @Test
    public void mergeTest() {
        int[] array1 = {1, 2, 5, 8, 9, 9, 13};
        int[] array2 = {-2, -1, 0, 2, 9, 9, 14};
        int[] expected = {-2, -1, 0, 1, 2, 2, 5, 8, 9, 9, 9, 9, 13, 14};
        Array array = new Array();
        int[] actual = array.merge(array1, array2);
        Assert.assertArrayEquals(expected, actual);
    }

}