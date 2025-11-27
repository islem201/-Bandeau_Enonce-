package animation;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;


public class Scenario {

    private static class Etape {
        Effet effet;
        int repetitions;

        Etape(Effet e, int r) { effet = e; repetitions = Math.max(1, r); }
    }

    private final List<Etape> etapes = new ArrayList<>();

    public Scenario() {}

    public void ajouter(Effet e, int repetitions) {
        etapes.add(new Etape(e, repetitions));
    }

    public void jouer(Bandeau b) {
        for (Etape et : etapes) {
            for (int i = 0; i < et.repetitions; i++) {
                et.effet.jouer(b);
            }
        }
    }
}
