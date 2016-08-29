package module5.ua.goit.java.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ParameterizedMathSortTest {
    private int[] expectedArray;
    private int[] inputArray;

    public ParameterizedMathSortTest(int[] expectedArray, int[] inputArray) {
        this.expectedArray = expectedArray;
        this.inputArray = inputArray;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{-77, -63, -63, -33, -24, -18, 33, 41, 86, 92}, new int[]{92, -18, -33, 86, -63, 33, -24, -77, 41, -63}},
                {new int[]{-13, -12, -6, -6, -1, -1, 13}, new int[]{-1, -6, -6, 13, -12, -13, -1}},
                {new int[]{-838, -774, -704, -687, -644, -546, -418, -284, 255, 273, 318, 362, 390, 707, 883}, new int[]{-284, 255, -418, 273, 390, -687, 362, -644, 318, -704, -774, 707, 883, -546, -838}}
        });
    }

    @Test
    public void sortArray() throws Exception {
        assertArrayEquals(expectedArray, Math.sortArray(inputArray));
    }

    @Test
    public void sortMergeArray() throws Exception {
        assertArrayEquals(expectedArray, Math.sortArray(inputArray));
    }
}
