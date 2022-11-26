package at.fhtw.lpa.klausur;

public class Girokonto extends Konto {
    private double disporahmen;

    public Girokonto() {
    }

    public Girokonto(String iban, double kontostand, Kunde kunde, double disporahmen) {
        super(iban, kontostand, kunde);
        this.disporahmen = disporahmen;
    }

    public double getDisporahmen() {
        return disporahmen;
    }

    public void setDisporahmen(double disporahmen) {
        this.disporahmen = disporahmen;
    }

    @Override
    public void auszahlen(double betrag) throws IllegalArgumentException {
        if(betrag < this.disporahmen){
            super.auszahlen(betrag);
        } else {
            throw new IllegalArgumentException("Betrag kann nicht ausgezahlt werden. Der Disporahmen ist zu klein.");
        }

    }

    @Override
    public String toString() {
        return getIban() + " (Girokonto), Kontostand: " + getKontostand();
    }
}
