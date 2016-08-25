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
    public void encryptNull() throws Exception {
        encriptDecript.encrypt(null);
    }

    @Test(timeout = 1000, expected = IllegalArgumentException.class)
    public void encryptEmpty() throws Exception {
        encriptDecript.encrypt("");
    }


    @Test(timeout = 1000, expected = IllegalArgumentException.class)
    public void decryptNull() throws Exception {
        encriptDecript.decrypt(null);
    }

    @Test(timeout = 1000, expected = IllegalArgumentException.class)
    public void decryptEmpty() throws Exception {
        encriptDecript.decrypt("");
    }

    @Test(timeout = 1000)
    public void encrypt() throws Exception {
        String expected = "Of{f%nx%f%ljsjwfq2uzwutxj%htruzyjw%uwtlwfrrnsl%qfslzflj3";
        String textDectipt = "Java is a general-purpose computer programming language.";

        String result = encriptDecript.encrypt(textDectipt);
        assertEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void decrypt() throws Exception {
        String expected = "Java is a general-purpose computer programming language.";
        String textEncript = "Of{f%nx%f%ljsjwfq2uzwutxj%htruzyjw%uwtlwfrrnsl%qfslzflj3";

        String result = encriptDecript.decrypt(textEncript);
        assertEquals(expected, result);
    }
}
