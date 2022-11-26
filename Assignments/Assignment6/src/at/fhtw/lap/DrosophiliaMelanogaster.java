package at.fhtw.lap;

public class DrosophiliaMelanogaster extends Insect {
    private String color;
    private String eyeColor;

    public DrosophiliaMelanogaster() {
    }

    public DrosophiliaMelanogaster(String habitat, int age, String gender, String housing, int numberOfWings, String color, String eyeColor) {
        super(habitat, age, gender, housing, numberOfWings);
        this.color = color;
        this.eyeColor = eyeColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "DrosophiliaMelanogaster{" +
                "color='" + color + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", housing='" + housing + '\'' +
                ", numberOfWings=" + numberOfWings +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
