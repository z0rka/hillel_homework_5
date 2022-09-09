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
        String reversedStr = "";

        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }

        return reversedStr;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        if (str.equals(stringReverse(str)))
            return true;
        return false;
    }
}
