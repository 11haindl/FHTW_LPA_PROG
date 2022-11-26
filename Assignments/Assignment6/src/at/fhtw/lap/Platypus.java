package at.fhtw.lap;

public class Platypus extends Mammal {
    private int clutchOfEggs;
    private float paekLength;

    public Platypus() {
    }

    public Platypus(String habitat, int age, String gender, float bodyTemperature, String hairColor, int clutchOfEggs, float paekLength) {
        super(habitat, age, gender, bodyTemperature, hairColor);
        this.clutchOfEggs = clutchOfEggs;
        this.paekLength = paekLength;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("gck gck gck");
    }

    public int getClutchOfEggs() {
        return clutchOfEggs;
    }

    public void setClutchOfEggs(int clutchOfEggs) {
        this.clutchOfEggs = clutchOfEggs;
    }

    public float getPaekLength() {
        return paekLength;
    }

    public void setPaekLength(float paekLength) {
        this.paekLength = paekLength;
    }

    @Override
    public String toString() {
        return "Platypus{" +
                "clutchOfEggs=" + clutchOfEggs +
                ", paekLength=" + paekLength +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
