package at.fhtw.lap;

public class Mammal extends Animal {
    protected float bodyTemperature;
    protected String hairColor;

    public Mammal() {
    }

    @Override
    public void getAnimalSound() { }

    public Mammal(String habitat, int age, String gender, float bodyTemperature, String hairColor) {
        super(habitat, age, gender);
        this.bodyTemperature = bodyTemperature;
        this.hairColor = hairColor;
    }

    public float getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(float bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
