package at.fhtw.lap;

public class Bird extends Animal{
    protected float wingSpan;
    protected int clutchOfEggs;

    public Bird() {
    }

    public Bird(String habitat, int age, String gender, float wingSpan, int clutchOfEggs) {
        super(habitat, age, gender);
        this.wingSpan = wingSpan;
        this.clutchOfEggs = clutchOfEggs;
    }

    @Override
    public void getAnimalSound() {

    }

    public float getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getClutchOfEggs() {
        return clutchOfEggs;
    }

    public void setClutchOfEggs(int clutchOfEggs) {
        this.clutchOfEggs = clutchOfEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wingSpan=" + wingSpan +
                ", clutchOfEggs=" + clutchOfEggs +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
