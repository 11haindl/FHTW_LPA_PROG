package at.fhtw.lap;

public class Dog extends Canine{
    private String breed;
    private String owner;

    public Dog() {
    }

    public Dog(String habitat, int age, String gender, float bodyTemperature, String hairColor, boolean isDomesticated, float earLength, String breed, String owner) {
        super(habitat, age, gender, bodyTemperature, hairColor, isDomesticated, earLength);
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public void getAnimalSound() {
        System.out.println("wau wau");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", owner='" + owner + '\'' +
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
