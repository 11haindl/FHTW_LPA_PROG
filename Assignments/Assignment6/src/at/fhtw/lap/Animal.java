package at.fhtw.lap;

public abstract class Animal {
    protected String habitat;
    protected int age;
    protected String gender;

    public Animal() { }

    public Animal(String habitat, int age, String gender) {
        this.habitat = habitat;
        this.age = age;
        this.gender = gender;
    }

    public abstract void getAnimalSound();

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "habitat='" + habitat + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
