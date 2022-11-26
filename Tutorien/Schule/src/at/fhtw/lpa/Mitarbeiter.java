package at.fhtw.lpa;

public abstract class Mitarbeiter extends Person {
    protected double gehalt;

    public Mitarbeiter() {
    }

    public Mitarbeiter(String vorname, String nachname, double gehalt) {
        super(vorname, nachname);
        this.gehalt = gehalt;
    }

    public abstract int geturlaubsanspruch();

    public abstract double getJahresgehalt();

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) throws IllegalArgumentException{
        if (gehalt > 0){
            this.gehalt = gehalt;
        } else {
            throw new IllegalArgumentException("Gehalt muss größer als 0 sein");
        }

    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "gehalt=" + gehalt +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
