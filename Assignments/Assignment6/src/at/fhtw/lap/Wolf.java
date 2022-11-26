package at.fhtw.lap;

public class Wolf extends Canine{
    private int packSize;
    private String subSpecies;

    public Wolf() {
    }

    public Wolf(String habitat, int age, String gender, float bodyTemperature, String hairColor, boolean isDomesticated, float earLength, int packSize, String subSpecies) {
        super(habitat, age, gender, bodyTemperature, hairColor, isDomesticated, earLength);
        this.packSize = packSize;
        this.subSpecies = subSpecies;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("Aouuuuu");
    }

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    public String getSubSpecies() {
        return subSpecies;
    }

    public void setSubSpecies(String subSpecies) {
        this.subSpecies = subSpecies;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "packSize=" + packSize +
                ", subSpecies='" + subSpecies + '\'' +
                ", isDomesticated=" + isDomesticated +
                ", earLength=" + earLength +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
