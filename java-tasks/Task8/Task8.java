public class Task8 {
    public static void isPalindrome(String word) {
        System.out.println(
                "Zodis \"" + word + "\" yra palindromas: " +
                        (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
        );
    }
}

