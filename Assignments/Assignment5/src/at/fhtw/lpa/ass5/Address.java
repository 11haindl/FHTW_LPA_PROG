package at.fhtw.lpa.ass5;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String street;
    private String houseNumber;
    private String postalcode;
    private String city;
    private List<Person> personList = new ArrayList<>();

    public Address() {
    }

    public Address(String street, String houseNumber, String postalcode, String city) {
        this.setStreet(street);
        this.setHouseNumber(houseNumber);
        this.setPostalcode(postalcode);
        this.setCity(city);
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void addPersonToAddress(Person person){
        this.personList.add(person);
    }

    @Override
    public String toString() {
        return street + " " + houseNumber + ", " + postalcode + " " + city;
    }
}
