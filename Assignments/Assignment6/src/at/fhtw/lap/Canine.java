package at.fhtw.lap;

public class Canine extends Mammal{
    protected boolean isDomesticated;
    protected float earLength;

    public Canine() {
    }

    @Override
    public void getAnimalSound() {
        System.out.println("wuff wuff");
    }

    public Canine(String habitat, int age, String gender, float bodyTemperature, String hairColor, boolean isDomesticated, float earLength) {
        super(habitat, age, gender, bodyTemperature, hairColor);
        this.isDomesticated = isDomesticated;
        this.earLength = earLength;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    public float getEarLength() {
        return earLength;
    }

    public void setEarLength(float earLength) {
        this.earLength = earLength;
    }

    @Override
    public String toString() {
        return "Canine{" +
                "isDomesticated=" + isDomesticated +
                ", earLength=" + earLength +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
