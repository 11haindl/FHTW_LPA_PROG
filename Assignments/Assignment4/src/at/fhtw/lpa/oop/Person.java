package at.fhtw.lpa.oop;

public class Person {
    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private int age;
    private String gender; // w/m/d

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public double getBMI(){
        return weight / Math.pow((double)height/100, 2);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")" ;
    }
}
