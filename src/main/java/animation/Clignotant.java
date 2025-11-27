package animation;

import bandeau.Bandeau;
import java.awt.Color;


public class Clignotant implements Effet {
    private final String message;
    private final int delai;
    private final Color c1;
    private final Color c2;

    public Clignotant(String message, int delai, Color c1, Color c2) {
        this.message = message;
        this.delai = delai;
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public void jouer(Bandeau b) {
        b.setMessage(message);
        Color orig = b.getForeground();
        for (int i = 0; i < 10; i++) {
            b.setForeground((i % 2 == 0) ? c1 : c2);
            b.sleep(delai);
        }
        b.setForeground(orig);
    }

    @Override
    public String getNom() { return "Clignotant"; }
}
