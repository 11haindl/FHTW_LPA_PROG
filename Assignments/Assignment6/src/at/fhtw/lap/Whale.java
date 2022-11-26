package at.fhtw.lap;

public class Whale extends Mammal{
    protected float flukeWidth;
    protected float diveDistance;

    public Whale() {
    }

    public Whale(String habitat, int age, String gender, float bodyTemperature, String hairColor, float flukeWidth, float diveDistance) {
        super(habitat, age, gender, bodyTemperature, hairColor);
        this.flukeWidth = flukeWidth;
        this.diveDistance = diveDistance;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("wuuuuuu");
    }

    public float getFlukeWidth() {
        return flukeWidth;
    }

    public void setFlukeWidth(float flukeWidth) {
        this.flukeWidth = flukeWidth;
    }

    public float getDiveDistance() {
        return diveDistance;
    }

    public void setDiveDistance(float diveDistance) {
        this.diveDistance = diveDistance;
    }

    @Override
    public String toString() {
        return "Whale{" +
                "flukeWidth=" + flukeWidth +
                ", diveDistance=" + diveDistance +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
