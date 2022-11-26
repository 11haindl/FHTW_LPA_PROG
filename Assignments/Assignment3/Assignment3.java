public class Assignment3 {
    public static void main(String[] args) {

        // Beispiel 1
        printOddNumbers(40);
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 2
        generateOutput(9);
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 3
        printAllDivisors(42);
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 4
        getPI(5);
        System.out.printf("\n-------------------------------------------------\n\n");

        // Beispiel 5
        printSpecialNumbers();
        System.out.printf("\n-------------------------------------------------\n\n");
    }

    public static void printOddNumbers(int n){
        for (int i = 1; i <= n; i++){
            if(i % 2 == 1){
                System.out.printf("%d ", i);
            }
        }
    }

    public static void generateOutput(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public static void printAllDivisors(int n){
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.printf("%d ", i);
            }
        }
    }

    public static void getPI(int n){
        double pi = 0.0;
        for (int k = 0; k <= n; k++){
            double kAsDouble = (double) k;
            pi += (1/Math.pow(16, k)) * (4/(8*kAsDouble + 1) - 2/(8*kAsDouble + 4) - 1/(8*kAsDouble + 5) - 1/(8*kAsDouble + 6));
        }
        System.out.println(pi);
    }

    public static void printSpecialNumbers() {
        // works also for a limit less than 25
        final int limit = 25;

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i + j + k > limit) {
                        System.out.printf("%d%d%d ", i, j, k);
                    }
                }
            }
        }
    }
}
