import at.fhtw.lpa.ass5.Address;
import at.fhtw.lpa.ass5.Book;
import at.fhtw.lpa.ass5.Person;

public class Assignment5 {

    public static void main(String[] args) {
        //andi, hannah and philipp have address0
        Address address0 = new Address("Schubertstraße", "23", "8010", "Graz");
        Person andi = new Person("Andreas", "Gruber", 53, address0);
        Person hannah = new Person("Hannah", "Gruber", 50, address0);
        Person philipp = new Person("Philipp", "Gruber", 23, address0);
        address0.addPersonToAddress(andi);
        address0.addPersonToAddress(hannah);
        address0.addPersonToAddress(philipp);

        //philipp additionally has address1
        Address address1 = new Address("Bienengasse", "22/3/12", "1020", "Wien");
        philipp.addAddressToPerson(address1);
        address1.addPersonToAddress(philipp);

        //add books to persons
        andi.addBook(new Book("Der Davinci Code", "Dan Brown", 2017));
        andi.addBook(new Book("Der Kastanienmann", "Susanne Dahmann", 2021));
        hannah.addBook(new Book("Die dunklen Wasser von Aberdeen", "Stuart MacBride", 2013));
        philipp.addBook(new Book("Harry Potter und der Stein der Weisen", "J. K. Rowling", 1998));
        philipp.addBook(new Book("Harry Potter und die Kammer des Schreckens", "J. K. Rowling", 1999));
        philipp.addBook(new Book("Harry Potter und der Gefangene von Azkaban", "J. K. Rowling", 1999));
        philipp.addBook(new Book("Harry Potter und der Feuerkelch", "J. K. Rowling", 2000));
        philipp.addBook(new Book("Harry Potter und der Orden des Phönix", "J. K. Rowling", 2003));
        philipp.addBook(new Book("Harry Potter und der Halbblutprinz", "J. K. Rowling", 2005));
        philipp.addBook(new Book("Harry Potter und die Heiligtümer des Todes", "J. K. Rowling", 2007));

        //print all persons with address0
        printPersonsFromAdress(address0);

        //print all addresses of person philipp
        printAddressesFromPerson(philipp);

        //print all books of person andi
        printBooksFromPerson(andi);

        //print all books of person philipp
        printBooksFromPerson(philipp);



        // from Assignment 4
        /*
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Andreas", "Gruber", 24));
        personList.add(new Person("Antonia", "Hofer", 44));
        System.out.println("Hello!");
        System.out.println("Welcome to myApplication");
        getUserInput(personList);
        */
    }

    private static void printBooksFromPerson(Person person){
        System.out.println("books from person " + person.getFirstName() + " " + person.getLastName() + ":");
        for (Book book : person.getBookList()){
            System.out.println(book);
        }
        System.out.printf("\n-------------------------------------------------\n\n");
    }

    private static void printAddressesFromPerson(Person person){
        System.out.println("adresses from person " + person.getFirstName() + " " + person.getLastName() + ":");
        for (Address address : person.getAddressList()){
            System.out.println(address);
        }
        System.out.printf("\n-------------------------------------------------\n\n");
    }

    private static void printPersonsFromAdress(Address address){
        System.out.println("persons with address " + address + ":");
        for (Person person : address.getPersonList()){
            System.out.println(person);
        }
        System.out.printf("\n-------------------------------------------------\n\n");
    }

    // Methods from Assignment 4
    /*private static void getUserInput(List<Person> personList){
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
    }*/
}
