package lab.andersen.katokoleg.datastructures;

/**
 * @author Katok Oleg on 11.01.2021
 */
public class Array {

    /**
     * @param source - unsorted array with numbers
     * @return second descending number
     */
    public int getSecondMinElement(int[] source) {
        if (source.length <= 1) {
            throw new IllegalArgumentException("Not enough elements in array for check");
        }
        int min = source[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 1; i < source.length; i++) {
            if (source[i] <= min && secondMin > min) {
                secondMin = min;
                min = source[i];
            } else if (source[i] > min && source[i] < secondMin) {
                secondMin = source[i];
            }
        }
        return secondMin;
    }

    /**
     * @param array1 - sorted array
     * @param array2 - sorted array
     * @return resulting sorted array
     */
    public int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i1 < array1.length && i2 < array2.length) {
                if (array1[i1] <= array2[i2]) {
                    result[i] = array1[i1++];
                } else {
                    result[i] = array2[i2++];
                }
            } else if (i2 < array2.length) {
                result[i] = array2[i2++];
            } else if (i1 < array1.length) {
                result[i] = array1[i1++];
            }
        }
        return result;
    }
}