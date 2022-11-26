package at.fhtw.lap;

public class Feline extends Mammal{
    protected boolean hasMane;
    protected boolean isDomesticated;

    public Feline() {
    }

    public Feline(String habitat, int age, String gender, float bodyTemperature, String hairColor, boolean hasMane, boolean isDomesticated) {
        super(habitat, age, gender, bodyTemperature, hairColor);
        this.hasMane = hasMane;
        this.isDomesticated = isDomesticated;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("");
    }

    public boolean isHasMane() {
        return hasMane;
    }

    public void setHasMane(boolean hasMane) {
        this.hasMane = hasMane;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    @Override
    public String toString() {
        return "Feline{" +
                "hasMane=" + hasMane +
                ", isDomesticated=" + isDomesticated +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
