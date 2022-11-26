package at.fhtw.lpa.klausur;

public class Firmenkunde extends Kunde{
    public Firmenkunde(String firmenname) {
        this.firmenname = firmenname;
    }

    private String firmenname;

    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    @Override
    public String toString() {
        return getFirmenname() + ": " + getKonten().size() + " Konten:\n";
    }
}
