package at.fhtw.lpa.klausur;

public class Privatkunde extends Kunde {
    private String vorname;
    private String nachname;

    public Privatkunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
/*
    Anna Musterfrau: 2 Konten:
    AT00786598324571 (Girokonto)
    AT00786598324573 (Terminkonto)
    o Max Mustermann: 1 Konto:
    AT00786598324577 (Girokonto)
    o Lagerhaus Tulln: 1 Konto:
    AT00786598324579 (Girokonto)

     */

    @Override
    public String toString() {
        return getVorname() + " " + getNachname() + ": " + getKonten().size() + " Konten:\n";
    }
}
