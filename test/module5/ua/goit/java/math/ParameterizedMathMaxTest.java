package module5.ua.goit.java.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ParameterizedMathMaxTest {
    private int expected;
    private int[] inputArray;

    public ParameterizedMathMaxTest(int expected, int[] inputArray) {
        this.expected = expected;
        this.inputArray = inputArray;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {92, new int[]{92, -18, -33, 86, -63, 33, -24, -77, 41, -63}},
                {13, new int[]{-1, -6, -6, 13, -12, -13, -1}},
                {883, new int[]{-284, 255, -418, 273, 390, -687, 362, -644, 318, -704, -774, 707, 883, -546, -838}}
        });

    }

    @Test
    public void min() throws Exception {
        assertEquals(expected, Math.max(inputArray));
    }
}
