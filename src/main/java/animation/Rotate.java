package animation;

import bandeau.Bandeau;


public class Rotate implements Effet {
    private final String message;
    private final int steps;
    private final int delai;

    public Rotate(String message, int steps, int delai) {
        this.message = message;
        this.steps = steps;
        this.delai = delai;
    }

    @Override
    public void jouer(Bandeau b) {
        b.setMessage(message);
        for (int i = 0; i < steps; i++) {
            float angle = (float) (2 * Math.PI * i / steps);
            b.setRotation(angle);
            b.sleep(delai);
        }
        b.setRotation(0.0f);
    }

    @Override
    public String getNom() { return "Rotate"; }
}
