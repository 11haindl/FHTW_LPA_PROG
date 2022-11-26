import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

        // Beispiel 1
        System.out.println("Geben Sie eine ganze Zahl ein: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Die Summe von 1 bis %d ist %d", n, getSumFrom1ToN(n));
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 2
        readAndSumInts();
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 3
        checkPin();
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 4
        System.out.println("Geben Sie eine ganze Zahl ein: ");
        int p = sc.nextInt();
        System.out.printf("%d ist eine Primzahl? - %b", p, isPrime(p));
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 5
        int[] numbers = getNumArray();
        System.out.printf("%d", getMax(numbers));
        System.out.printf("\n-------------------------------------------------\n\n");

    }

    public static int getSumFrom1ToN(int n){

        return (n*(n+1))/2;
    }

    public static void readAndSumInts(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        do{
            System.out.println("Geben Sie eine ganze Zahl ein: ");
            i = sc.nextInt();
            sum += i;
        } while(i != 0);

        System.out.printf("Die Summe ist %d", sum);
    }

    public static void checkPin(){
        final int code = 4567;
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie den Pin ein: ");
        for (int i = 0; i < 3; i++){
            int input = sc.nextInt();
            if(input == code){
                System.out.println("Correct, welcome back.");
                break;
            }else{
                if(i < 2){
                    System.out.println("Incorrect, try again.");
                }else{
                    System.out.println("Sorry but you have been locked out.");
                }
            }
        }
    }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int[] getNumArray() {
        System.out.println("Bitte geben Sie die zu überprüfenden Zalhen ein mit Komma getrennt");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String inputRemovedWhitespace = userInput.replaceAll("\\s", "");
        String[] inputToArray = inputRemovedWhitespace.split(",");

        int[] numArray = new int[inputToArray.length];
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = Integer.parseInt(inputToArray[i]);
        }
        return numArray;
    }

    public static int getMax(int[] numbers){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(numbers[i], max);
        }
        return max;
    }
}
