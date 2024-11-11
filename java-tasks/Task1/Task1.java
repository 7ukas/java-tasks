public class Task1 {
    public static void logicalOperations() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite 1-aji skaiciu: ");
        int first = scanner.nextInt();

        System.out.print("Iveskite 2-aji skaiciu: ");
        int second = scanner.nextInt();

        System.out.printf(
                "Abu lyginiai: %b\n",
                first % 2 == 0 && second % 2 == 0
        );

        System.out.printf(
                "Bent vienas teigiamas: %b\n",
                first > 0 || second > 0
        );

        System.out.printf(
                "Pirmas skaicius didesnis uz antra ir abu dalomi is 5: %b\n",
                first > second && (first % 5 == 0 && second % 5 == 0)
        );
    }
}

