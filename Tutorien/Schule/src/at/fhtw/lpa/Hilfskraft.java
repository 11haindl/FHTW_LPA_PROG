package at.fhtw.lpa;

public class Hilfskraft extends Mitarbeiter{

    public Hilfskraft() {
    }

    public Hilfskraft(String vorname, String nachname, double gehalt) {
        super(vorname, nachname, gehalt);
    }

    @Override
    public int geturlaubsanspruch() {
        return 25;
    }

    @Override
    public double getJahresgehalt() {
        return getGehalt() * 12;
    }

    @Override
    public String toString() {
        return "Hilfskraft{" +
                "gehalt=" + gehalt +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
