package at.fhtw.lpa;

public class Lehrer extends Mitarbeiter{
    private int wochenstunden;
    private Klasse klasse;

    public int getWochenstunden() {
        return wochenstunden;
    }

    public Lehrer() {
    }

    public Lehrer(String vorname, String nachname, double gehalt, int wochenstunden, Klasse klasse) {
        super(vorname, nachname, gehalt);
        this.wochenstunden = wochenstunden;
        this.klasse = klasse;
    }

    public void setWochenstunden(int wochenstunden) throws IllegalArgumentException {
        if(wochenstunden > 0){
            this.wochenstunden = wochenstunden;
        }else {
            throw new IllegalArgumentException("Wochenstunden müssen größer als 0 sein.");
        }

    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    @Override
    public int geturlaubsanspruch() throws IllegalArgumentException {
        if (this.wochenstunden >= 22){
            return 70;
        }
        if (this.wochenstunden >= 16){
            return 60;
        }
        if (this.wochenstunden >= 10){
            return 50;
        } else {
            return 30;
        }

    }

    @Override
    public double getJahresgehalt() {
        return getGehalt() * 14;
    }

    @Override
    public String toString() {
        return "Lehrer{" +
                "wochenstunden=" + wochenstunden +
                ", gehalt=" + gehalt +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
