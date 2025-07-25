package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World!");
            String asciiArt = FigletFont.convertOneLine("Hello World!");
            System.out.println(asciiArt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
