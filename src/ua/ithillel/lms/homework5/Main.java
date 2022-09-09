package ua.ithillel.lms.homework5;

import ua.ithillel.lms.homework5.model.WordsGame;

public class Main {
    public static void main(String[] args) {

         WordsGame wordsGame = new WordsGame();

        System.out.println("Other homework");

        System.out.println("-".repeat(20));
        System.out.println(findSymbolOccurance("Hello there!", 'l'));

        System.out.println("-".repeat(20));
        System.out.println(findWordPosition("Apollo", "pollo"));

        System.out.println("-".repeat(20));
        System.out.println(isPalindrome("Anna"));

        System.out.println("-".repeat(20));
        System.out.println(stringReverse("Hello"));

    }

    public static int findSymbolOccurance(String str, char symbol) {
        if (str == null || symbol == '\0') {
            System.out.println("There is empty parameter");
            return 0;
        }

        char buff[] = str.toCharArray();
        int count = 0;

        for (char c : buff) {
            if (c == symbol) count++;
        }

        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        return str.equals(stringReverse(str));
    }
}
