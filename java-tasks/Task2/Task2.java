public class Task2 {
    public static void stringOperations() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite sakini: ");
        String sentence = scanner.nextLine();

        System.out.println("Originalus sakinys: " + sentence);
        System.out.println("Didziosiomis: " + sentence.toUpperCase());
        System.out.println("Atvirkscias: " + new StringBuilder(sentence).reverse().toString());
        System.out.println("Zodziu skaicius: " + sentence.split(" ").length);
        System.out.println("Prasideda \"Java\": " + sentence.startsWith("Java"));
    }
}

