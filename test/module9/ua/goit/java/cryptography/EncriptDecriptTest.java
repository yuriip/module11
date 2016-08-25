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

    @Test(expected = IllegalArgumentException.class, timeout = 1000)
    public void encryptDecript() throws Exception {
        String expected = null;
        encriptDecript.encrypt(expected);

        expected = "";
        encriptDecript.encrypt(expected);

        expected = "Java is a general-purpose computer programming language.";

        String result = encriptDecript.encrypt(expected);
        assertNotEquals(expected, result);

        result = encriptDecript.decrypt(encriptDecript.encrypt(expected));
        assertEquals(expected, result);
    }
}
