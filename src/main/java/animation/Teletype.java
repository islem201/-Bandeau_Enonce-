package animation;

import bandeau.Bandeau;


public class Teletype implements Effet {
    private final String message;
    private final int delai;

    public Teletype(String message, int delai) {
        this.message = message;
        this.delai = delai;
    }

    @Override
    public void jouer(Bandeau b) {
        for (int i = 1; i <= message.length(); i++) {
            b.setMessage(message.substring(0, i));
            b.sleep(delai);
        }
    }

    @Override
    public String getNom() { return "Teletype"; }
}
