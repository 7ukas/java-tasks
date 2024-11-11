public class Task10 {
    public static void analyzeInput(int targetValue) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite skaicius (atskirdami tarpais): ");
        String[] lines = scanner.nextLine().split(" ");

        int[] numbers = new int[lines.length];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < lines.length; i++) {
            numbers[i] = Integer.parseInt(lines[i]);

            sum += numbers[i];
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        Arrays.sort(numbers);
        System.out.println(
                "Skaicius " + targetValue + " rastas masyve: " +
                        (Arrays.binarySearch(numbers, targetValue) >= 0)
        );

        System.out.println("Reiksmes: " + Arrays.toString(numbers));
        System.out.printf("Vidurkis: %.2f\n", (double)sum / numbers.length);
        System.out.printf("Didziausia: %d\n", max);
        System.out.printf("Maziausia: %d\n", min);
    }
}

