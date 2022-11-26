import at.fhtw.lpa.oop.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        System.out.println("Hello!");
        System.out.println("Welcome to myApplication");
        getUserInput(personList);
    }

    private static void getUserInput(List<Person> personList){
        System.out.printf("\n-------------------------------------------------\n\n");
        System.out.println("[1] list of all persons");
        System.out.println("[2] enter new person");
        System.out.println("[3] update a person (by index)");
        System.out.println("[4] delete a person (by index)");
        System.out.println("[5] delete all persons");
        System.out.println("[6] exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        processUserInput(sc.nextInt(), personList);
    }

    private static void processUserInput(int input, List<Person> personList){

        switch (input){
            case 1:
                listAllUsers(personList);
                getUserInput(personList);
                break;
            case 2:
                createNewPerson(personList);
                getUserInput(personList);
                break;
            case 3:
                updatePerson(personList);
                getUserInput(personList);
                break;
            case 4:
                deletePerson(personList);
                getUserInput(personList);
                break;
            case 5:
                personList = new ArrayList<>();
                System.out.println("All persons got deleted!");
                getUserInput(personList);
            case 6:
                System.out.println("Good Bye!");
                return;
            default:
                System.out.println("No correct Input! Please select a valid number from the menu");
                getUserInput(personList);
        }
    }

    private static void listAllUsers(List<Person> personList){
        if(personList.size() == 0){
            System.out.println("The list is empty.");
        }else{
            for (Person person : personList){
                System.out.println(person);
            }
        }
    }

    private static void createNewPerson(List<Person> personList){
        Person person = new Person();
        System.out.println("Enter new person: ");
        person = enterPersonData();
        personList.add(person);
        System.out.println("The user " +  person + " was created successfully");
    }

    private static Person enterPersonData(){
        Scanner sc = new Scanner(System.in);
        Person myPerson3 = new Person();
        System.out.println("Vorname: ");
        myPerson3.setFirstName(sc.next());
        System.out.println("Nachname: ");
        myPerson3.setLastName(sc.next());
        System.out.println("Alter: ");
        myPerson3.setAge(sc.nextInt());
        System.out.println("Geschlecht (m/w/d): ");
        myPerson3.setGender(sc.next());
        System.out.println("Größe (in cm): ");
        myPerson3.setHeight(sc.nextInt());
        System.out.println("Gewicht (in kg): ");
        myPerson3.setWeight(sc.nextInt());

        return myPerson3;
    }

    private static void deletePerson(List<Person> personList){
        System.out.println("Enter index of person to delete: ");
        int index = getIndexFromUser();
        Person personToDelete = personList.get(index);
        personList.remove(index);
        System.out.println("Person " + personToDelete + " was deleted (index: " + index + ")");
    }

    private static void updatePerson(List<Person> personlist){
        System.out.println("Enter index of person to update");
        int index = getIndexFromUser();
        Person oldPerson = personlist.get(index);
        System.out.println("The Person " + oldPerson + " will be updated. Please enter new personal data:");
        Person newPerson = enterPersonData();
        personlist.set(index, newPerson);
        System.out.println("The person " + oldPerson + " got updated to " + newPerson);
    }

    private static int getIndexFromUser(){
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        return index;
    }
}
