package at.fhtw.lpa.klausur;

public class Sparplankonto extends Geldanlage{
    private double sparbetragMonatlich;

    public Sparplankonto() {
    }

    public Sparplankonto(String iban, double kontostand, Kunde kunde, double zinssatz, int laufzeitMonate, double sparbetragMonatlich) {
        super(iban, kontostand, kunde, zinssatz, laufzeitMonate);
        this.sparbetragMonatlich = sparbetragMonatlich;
    }

    public double getSparbetragMonatlich() {
        return sparbetragMonatlich;
    }

    public void setSparbetragMonatlich(double sparbetragMonatlich) {
        this.sparbetragMonatlich = sparbetragMonatlich;
    }

    @Override
    public double getPrognose() {
        return getKontostand() + (getSparbetragMonatlich() * getLaufzeitMonate());
    }

    @Override
    public String toString() {
        return getIban() + " (Sparplankonto), Kontostand: " + getKontostand() + ", Zinsatz: " + getZinssatz() + ", Laufzeit: " + getLaufzeitMonate() + ", Sparplan: " + getSparbetragMonatlich() + ", Prognose: " + getPrognose();
    }
}
