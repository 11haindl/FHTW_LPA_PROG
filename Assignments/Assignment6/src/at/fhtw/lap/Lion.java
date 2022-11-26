package at.fhtw.lap;

public class Lion extends Feline{
    private int packSize;
    private String maneColor;

    public Lion() {
    }

    public Lion(String habitat, int age, String gender, float bodyTemperature, String hairColor, boolean hasMane, boolean isDomesticated, int packSize, String maneColor) {
        super(habitat, age, gender, bodyTemperature, hairColor, hasMane, isDomesticated);
        this.packSize = packSize;
        this.maneColor = maneColor;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("roaaar");
    }

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "packSize=" + packSize +
                ", maneColor='" + maneColor + '\'' +
                ", hasMane=" + hasMane +
                ", isDomesticated=" + isDomesticated +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
