package module9.ua.goit.java.cryptography;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncriptDecriptTest {
    private static int offset = 5;
    private static EncriptDecript encriptDecript;

    @BeforeClass
    public static void setUpClass() throws Exception {
        encriptDecript = new EncriptDecript(offset);
    }

    @Test(timeout = 1000, expected = IllegalArgumentException.class)
    public void encryptDecriptException() throws Exception {
        String expected = null;
        encriptDecript.encrypt(expected);

        expected = "";
        encriptDecript.encrypt(expected);
    }

    @Test(timeout = 1000)
    public void enctipt() throws Exception {
        String expected = "Java is a general-purpose computer programming language.";

        String result = encriptDecript.encrypt(expected);
        assertNotEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void dectipt() throws Exception {
        String expected = "Java is a general-purpose computer programming language.";
        String expectedEncript = encriptDecript.encrypt(expected);

        String result = encriptDecript.decrypt(expectedEncript);
        assertEquals(expected, result);
    }
}
