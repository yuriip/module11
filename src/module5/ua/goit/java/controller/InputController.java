package module5.ua.goit.java.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputController {
    private BufferedReader bufferedReader;

    public InputController(InputStream in) {
        this.bufferedReader = new BufferedReader(new InputStreamReader(in));
    }

    public int readInt(String str) throws IOException {
        System.out.print(str);
        int res = 0;

        while (true) {
            try {
                String str1 = bufferedReader.readLine();
                res = Integer.parseInt(str1);
                if (res <= 0) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (NullPointerException | IllegalArgumentException e) {
                if (str.length() != 0 && '\n' == str.charAt(str.length() - 1)) {
                    str = str.substring(0, str.length() - 1);
                }
                System.out.println("!!! Ошибка. Необходимо ввести число больше нуля. Попробуйте еще раз !!!");
                System.out.println("!!! " + str + " !!!");
            }
        }
        return res;
    }

    public String readString() throws IOException {
        return bufferedReader.readLine();
    }
}
