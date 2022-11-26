package at.fhtw.lpa;

import java.util.List;

public class Klasse {
    private String bezeichnung;
    private Lehrer lehrer;
    private List<Schueler> schuelerList;

    public Klasse() {
    }

    public Klasse(String bezeichnung, Lehrer lehrer, List<Schueler> schuelerList) {
        this.bezeichnung = bezeichnung;
        this.lehrer = lehrer;
        this.schuelerList = schuelerList;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Lehrer getLehrer() {
        return lehrer;
    }

    public void setLehrer(Lehrer lehrer) {
        this.lehrer = lehrer;
    }

    public List<Schueler> getSchuelerList() {
        return schuelerList;
    }

    public void setSchuelerList(List<Schueler> schuelerList) {
        this.schuelerList = schuelerList;
    }

    @Override
    public String toString() {
        return "Klasse{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", lehrer=" + lehrer +
                ", schuelerList=" + schuelerList +
                '}';
    }
}
