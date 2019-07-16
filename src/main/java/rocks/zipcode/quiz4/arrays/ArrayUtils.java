package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] answer = new String[values.length-1];
        System.arraycopy(values, 0, answer, 0, values.length/2);
        System.arraycopy(values, (values.length/2)+1,answer,(values.length/2),values.length-values.length/2-1);
        return answer;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values,values.length-1);
    }
}