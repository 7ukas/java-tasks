public class Task6 {
    public static void calculateFactorial(int n) {
        int factorial = n;

        for (int i = n-1; i > 1; i--) {
            factorial *= i;
        }

        System.out.println("Faktorialas (" + n + "!) = " + factorial);
    }
}

