package at.fhtw.lap;

public class Insect extends Animal{
    protected String housing;
    protected int numberOfWings;

    public Insect() {
    }

    public Insect(String habitat, int age, String gender, String housing, int numberOfWings) {
        super(habitat, age, gender);
        this.housing = housing;
        this.numberOfWings = numberOfWings;
    }

    @Override
    public void getAnimalSound() {

    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String toString() {
        return "Insect{" +
                "housing='" + housing + '\'' +
                ", numberOfWings=" + numberOfWings +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
