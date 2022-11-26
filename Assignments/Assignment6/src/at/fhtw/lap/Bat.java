package at.fhtw.lap;

public class Bat extends Mammal{
    private float echolotationFrequency;
    private float wingLength;

    public Bat() {
    }

    public Bat(String habitat, int age, String gender, float bodyTemperature, String hairColor, float echolotationFrequency, float wingLength) {
        super(habitat, age, gender, bodyTemperature, hairColor);
        this.echolotationFrequency = echolotationFrequency;
        this.wingLength = wingLength;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("zzz zzzz zzz");
    }

    public float getEcholotationFrequency() {
        return echolotationFrequency;
    }

    public void setEcholotationFrequency(float echolotationFrequency) {
        this.echolotationFrequency = echolotationFrequency;
    }

    public float getWingLength() {
        return wingLength;
    }

    public void setWingLength(float wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public String toString() {
        return "Bat{" +
                "echolotationFrequency=" + echolotationFrequency +
                ", wingLength=" + wingLength +
                ", bodyTemperature=" + bodyTemperature +
                ", hairColor='" + hairColor + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
