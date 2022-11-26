package at.fhtw.lpa.ass5;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private int age;
    private String gender; // w/m/d
    private List<Address> addressList = new ArrayList<>();
    private List<Book> bookList = new ArrayList<>();

    public Person() {    }

    public Person(String firstName, String lastName, int age, Address address) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.addAddressToPerson(address);
    }

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

    public List<Address> getAddressList() {
        return addressList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")" ;
    }

    public void addAddressToPerson(Address address){
        addressList.add(address);
    }

    public void addBook(Book book){
        bookList.add(book);
    }
}
