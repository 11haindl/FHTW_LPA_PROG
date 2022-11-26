package at.fhtw.lpa.klausur;

public abstract class Konto {
    protected String iban;
    protected double kontostand;
    private Kunde kunde;

    public Konto() {
    }

    public Konto(String iban, double kontostand, Kunde kunde) {
        this.iban = iban;
        this.kontostand = kontostand;
        this.kunde = kunde;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public void einzahlen(double betrag) throws IllegalArgumentException{
        if (betrag > 0){
            this.kontostand += betrag;
        } else {
            throw new IllegalArgumentException("Betrag muss größer 0 sein");
        }
    }

    public void auszahlen(double betrag) throws  IllegalArgumentException{
        if (betrag > 0){
            this.kontostand -= betrag;
        } else {
            throw new IllegalArgumentException("Betrag muss größer 0 sein");
        }
    }

}
