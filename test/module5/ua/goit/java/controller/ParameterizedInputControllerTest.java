package module5.ua.goit.java.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ParameterizedInputControllerTest {
    private int expected;
    private InputController inputController;

    public ParameterizedInputControllerTest(int expected, String input) {
        this.expected = expected;
        inputController = new InputController(new ByteArrayInputStream(input.getBytes()));
    }

    @Parameterized.Parameters(name = "{index}: readInt({0} == {1})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10, "10"},
        });
    }

    @Test(timeout = 300)
    public void inputDataInt() throws Exception {
        String someString = "";

        inputController.readInt(someString);
    }
}
