package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World!");
            String titre = ResourceBundle.getBundle("app").getString("titre");
            String asciiArt = FigletFont.convertOneLine(titre);
            System.out.println(asciiArt);

            // affichage de l'environnement
            String environnement = ResourceBundle.getBundle("app").getString(
                    "environnement");
            System.out.println("Environnement : " + environnement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
