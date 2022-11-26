import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Beispiel 1: BereichII
        System.out.printf("Gegen Sie eine Zahl ein: ");
        int num = sc.nextInt();
        System.out.printf("Eingegebene Zahl %d ist im BereichII? - %b", num, isInArea2(num));
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 2: Volljährigkeit
        System.out.printf("Gegen Sie ihr Alter ein: ");
        int age = sc.nextInt();
        System.out.printf("Volljährig? - %b", isFullAge(age));
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 3: Registrierung
        String[] userData = readUserData();
        int age2 = Integer.parseInt(userData[2]);
        if(age2 < 21){
            System.out.printf("Leider sind Sie nicht alt genug\n");
        }else{
            System.out.printf("Möchten Sie Ihre Daten ansehen? (J/N): ");
            char showData = sc.next().toLowerCase().charAt(0);
            if(showData == 'j'){
                System.out.printf("\nIhre Benutzerdaten lauten: \n");
                printData(userData[0], userData[1], age2);
            } else {
                System.out.printf("Vielen Dank für Ihre Registrierung! Auf Wiedersehen!\n");
            }
        }
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 4: MIN, MAX
        //[(1,2,3); (1,3,2); (3,1,2); (27,-26,26); (22,22,22)]
        int[] triple = getTriple();
        int min = getMinimum(triple[0], triple[1], triple[2]);
        int max = getMaximum(triple[0], triple[1], triple[2]);
        System.out.printf("Das Minimum von (%d, %d, %d) ist %d\n", triple[0], triple[1], triple[2], min);
        System.out.printf("Das Maximum von (%d, %d, %d) ist %d", triple[0], triple[1], triple[2], max);
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 5: Schaltjahr
        System.out.printf("Geben Sie ein Jahr ein: ");
        int year = sc.nextInt();
        boolean isLeapYear = isLeapYear(year);
        System.out.printf("Ist das Jahr %d ein Schaltjahr? - %b", year, isLeapYear);
    }

    private static boolean isInArea2(int num){
        if(((num >= 1500) && (num <= 3500)) || ((num >= 7500) && (num <= 10000))){
            return true;
        } else {
            return false;
        }
    }

    private static boolean isFullAge(int age){
        return (age >=18) ? true : false;
    }

    private static String[] readUserData(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Registrierung\n");
        System.out.printf("Vorname: ");
        String firstName = sc.next();
        System.out.printf("Nachname: ");
        String lastName = sc.next();
        System.out.printf("Alter: ");
        String age = sc.next();
        String[] userData = {firstName, lastName, age};

        return userData;
    }

    private static void printData(String firstName, String lastName, int age){
        System.out.printf("Vorname: %s\n", firstName);
        System.out.printf("Nachname: %s\n", lastName);
        System.out.printf("Alter: %d\n", age);
    }

    private static int[] getTriple(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("1. Zahl: ");
        int num1 = sc.nextInt();
        System.out.printf("2. Zahl: ");
        int num2 = sc.nextInt();
        System.out.printf("3. Zahl: ");
        int num3 = sc.nextInt();
        int[] triple = {num1, num2, num3};

        return triple;
    }

    private static int getMinimum(int x, int y, int z){
        int minimum = Math.min(x, Math.min(y, z));
        return minimum;
    }

    private static int getMaximum(int x, int y, int z){
        int maximum = Math.max(x, Math.max(y, z));
        return maximum;
    }

    private static boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0){
            return true;
        }else{
            return false;
        }
    }

}
