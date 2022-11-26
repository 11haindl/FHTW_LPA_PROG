package at.fhtw.lpa;

import java.util.ArrayList;
import java.util.List;

public class Schueler extends Person{
    private Klasse klasse;
    private List<Note> noten = new ArrayList<>();

    public Schueler() {
    }

    public Schueler(String vorname, String nachname, Klasse klasse, List<Note> noten) {
        super(vorname, nachname);
        this.klasse = klasse;
        this.noten = noten;
    }

    public double getNotendurchschnitt(){
        int sum = 0;
        for(Note note : this.noten) {
            sum += note.getNote();
        }
        return ((float) sum)/noten.size();
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    public List<Note> getNoten() {
        return noten;
    }

    public void setNoten(List<Note> noten) {
        this.noten = noten;
    }

    @Override
    public String toString() {
        return "Schueler{" +
                ", noten=" + noten +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
