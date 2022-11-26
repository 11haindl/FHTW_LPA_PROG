package at.fhtw.lpa.klausur;

public abstract class Geldanlage extends Konto{
    private double zinssatz;
    private int laufzeitMonate;

    public Geldanlage() {
    }

    public Geldanlage(String iban, double kontostand, Kunde kunde, double zinssatz, int laufzeitMonate) {
        super(iban, kontostand, kunde);
        this.zinssatz = zinssatz;
        this.laufzeitMonate = laufzeitMonate;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public int getLaufzeitMonate() {
        return laufzeitMonate;
    }

    public void setLaufzeitMonate(int laufzeitMonate) {
        this.laufzeitMonate = laufzeitMonate;
    }

    /*
    getPrognose() errechnet das voraussichtliche Endkapital bei Geldeinlage-Konten. Für
    Termingeldkonten wird die Zinseszins-Formel angewendet. Bei Sparplankonten wird
    einfachheitshalber der Zinssatz nicht berücksichtigt.
     */
    public abstract double getPrognose();

    @Override
    public void auszahlen(double betrag) throws IllegalArgumentException {
        throw new IllegalArgumentException("Keine Auszahlung erlaubt bei Geldeinlagekonten");
    }
}
