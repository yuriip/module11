package module5.ua.goit.java.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ParameterizedMathTest {
    private int[] inputArray;
    private int[] inputSampleData = new int[]{92, -18, -33, 86, -63, 33, -24, -77, 41, -63};

    private int expected;
    private int[] expectedSampleData = new int[]{-77, -63, -63, -33, -24, -18, 33, 41, 86, 92};

    public ParameterizedMathTest(int expected, int[] inputArray) {
        this.expected = expected;
        this.inputArray = inputArray;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {92, new int[]{92, -18, -33, 86, -63, 33, -24, -77, 41, -63}}
        });
    }

    @Test
    public void max() throws Exception {
        assertEquals(expected, Math.max(inputArray));
    }

    @Test
    public void min() throws Exception {
        int min = -77;
        assertEquals(min, Math.min(inputSampleData));
    }

    @Test
    public void sortArray() throws Exception {
        assertArrayEquals(expectedSampleData, Math.sortArray(inputSampleData));
    }

    @Test
    public void sortMergeArray() throws Exception {
        assertArrayEquals(expectedSampleData, Math.sortMergeArray(inputSampleData));
    }
}
