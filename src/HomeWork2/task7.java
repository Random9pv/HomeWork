package HomeWork2;

import java.util.Locale;

public class task7 {
    public static void main(String[] args) {
        String abc = "Hello world!".replace('l', 'r');
        String abcBig = abc.toUpperCase();
        String abcBig2 = abcBig.substring(0, 8);
        System.out.println(abcBig2);
    }
}
