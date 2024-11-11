public class Task3 {
    public static void arrayOperations(int targetValue) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        double avg = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Iveskite " + (i+1) + "-aji skaiciu: ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(
                "Skaicius " + targetValue + " rastas masyve: " +
                        (Arrays.binarySearch(arr, targetValue) >= 0)
        );

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        avg /= arr.length;

        System.out.printf("Didziausias: %d\n", max);
        System.out.printf("Maziausias: %d\n", min);
        System.out.printf("Vidurkis: %.2f\n", avg);
    }
}

