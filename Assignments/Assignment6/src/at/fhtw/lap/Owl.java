package at.fhtw.lap;

public class Owl extends Bird{
    private String eyeColor;
    private String headShape;

    public Owl() {
    }

    public Owl(String habitat, int age, String gender, float wingSpan, int clutchOfEggs, String eyeColor, String headShape) {
        super(habitat, age, gender, wingSpan, clutchOfEggs);
        this.eyeColor = eyeColor;
        this.headShape = headShape;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("hoo hoo");
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHeadShape() {
        return headShape;
    }

    public void setHeadShape(String headShape) {
        this.headShape = headShape;
    }

    @Override
    public String toString() {
        return "Owl{" +
                "eyeColor='" + eyeColor + '\'' +
                ", headShape='" + headShape + '\'' +
                ", wingSpan=" + wingSpan +
                ", clutchOfEggs=" + clutchOfEggs +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
