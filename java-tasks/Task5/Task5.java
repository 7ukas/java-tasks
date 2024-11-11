public class Task5 {
    public static void printNumber(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.print(i + " ");
        } System.out.println();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        } System.out.println();

        System.out.printf("Visu skaiciu suma: %d", sum);
    }
}

