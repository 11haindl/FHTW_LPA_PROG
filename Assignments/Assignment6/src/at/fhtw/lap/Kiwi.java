package at.fhtw.lap;

public class Kiwi extends Bird{
    private float peakLength;
    private String subSpecies;

    public Kiwi() {
    }

    public Kiwi(String habitat, int age, String gender, float wingSpan, int clutchOfEggs, float peakLength, String subSpecies) {
        super(habitat, age, gender, wingSpan, clutchOfEggs);
        this.peakLength = peakLength;
        this.subSpecies = subSpecies;
    }

    public float getPeakLength() {
        return peakLength;
    }

    public void setPeakLength(float peakLength) {
        this.peakLength = peakLength;
    }

    public String getSubSpecies() {
        return subSpecies;
    }

    public void setSubSpecies(String subSpecies) {
        this.subSpecies = subSpecies;
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "peakLength=" + peakLength +
                ", subSpecies='" + subSpecies + '\'' +
                ", wingSpan=" + wingSpan +
                ", clutchOfEggs=" + clutchOfEggs +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
