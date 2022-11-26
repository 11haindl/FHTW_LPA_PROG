package at.fhtw.lap;

public class Dolphin extends Whale{
    private float jumpHeight;
    private String headShape;

    public Dolphin() {
    }

    public Dolphin(String habitat, int age, String gender, float bodyTemperature, String hairColor, float flukeWidth, float diveDistance, float jumpHeight, String headShape) {
        super(habitat, age, gender, bodyTemperature, hairColor, flukeWidth, diveDistance);
        this.jumpHeight = jumpHeight;
        this.headShape = headShape;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("ahhh ahhhhhh");
    }

    public float getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public String getHeadShape() {
        return headShape;
    }

    public void setHeadShape(String headShape) {
        this.headShape = headShape;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "jumpHeight=" + jumpHeight +
                ", headShape='" + headShape + '\'' +
                ", flukeWidth=" + flukeWidth +
                ", diveDistance=" + diveDistance +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
