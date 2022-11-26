package at.fhtw.lap;

public class Kangaroo extends Mammal{
    private float jumpLength;
    private float jumpHeight;

    public Kangaroo() {
    }

    public Kangaroo(String habitat, int age, String gender, float bodyTemperature, String hairColor, float jumpLength, float jumpHeight) {
        super(habitat, age, gender, bodyTemperature, hairColor);
        this.jumpLength = jumpLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("raa raa");
    }

    public float getJumpLength() {
        return jumpLength;
    }

    public void setJumpLength(float jumpLength) {
        this.jumpLength = jumpLength;
    }

    public float getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "jumpLength=" + jumpLength +
                ", jumpHeight=" + jumpHeight +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
