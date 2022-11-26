package at.fhtw.lpa.klausur;

public class Termingeldkonto extends Geldanlage{
    public Termingeldkonto() {
    }

    public Termingeldkonto(String iban, double kontostand, Kunde kunde, double zinssatz, int laufzeitMonate) {
        super(iban, kontostand, kunde, zinssatz, laufzeitMonate);
    }

    @Override
    public double getPrognose() {
        return getKontostand() * Math.pow((1 + getZinssatz()), getLaufzeitMonate());
    }

    /*
    getPrognose() errechnet das voraussichtliche Endkapital bei Geldeinlage-Konten. Für
    Termingeldkonten wird die Zinseszins-Formel angewendet. (Kn = K0 * (1 + p)^n) Bei Sparplankonten wird
    einfachheitshalber der Zinssatz nicht berücksichtigt.
     */

    @Override
    public void einzahlen(double betrag) throws IllegalArgumentException {
        throw new IllegalArgumentException("Keine Einzahlung erlaubt bei Termingeldkonten!");
    }

    @Override
    public String toString() {
        return getIban() + " (Termingeldkonto), Kontostand: " + getKontostand() + ", Zinsatz: " + getZinssatz() + ", Laufzeit: " + getLaufzeitMonate() + ", Prognose: " + getPrognose();
    }
}
