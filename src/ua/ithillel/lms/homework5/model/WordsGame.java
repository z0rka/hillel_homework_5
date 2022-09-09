package ua.ithillel.lms.homework5.model;

import java.util.Random;
import java.util.Scanner;

public class WordsGame {

    private static String[] words = {"apple", "orange", "lemon", "banana",
            "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    private static String secretWord = "***************";
    private Scanner scanner = new Scanner(System.in);
    private int randomisedNumber;
    private int wordNumber;

    public WordsGame() {
        Random random = new Random();

        randomisedNumber = random.nextInt(25);

        System.out.println("Hello , you have started playing my game , enjoy ");
        System.out.println("There are some words, and computer have chosen one random word , try to guess it!");

        gameStart();
    }

    private void gameStart() {

        System.out.println("List of words :");

        for (int i = 0; i < words.length; i++) {
            System.out.print(i + " " + words[i] + " ");

            if (i == (words.length / 2)) {
                System.out.println();
            }
        }
        chooseWord();
    }

    private void chooseWord() {
        System.out.println("\n" + "Enter number of the word please = ");
        wordNumber = scanner.nextInt();

        System.out.println("Your word " + words[wordNumber]);

        compareWords();
    }

    private void compareWords() {
        if (words[randomisedNumber].equals(words[wordNumber])) {
            System.out.println("You win!");
        } else {
            System.out.println("Incorrect -_-");
            helpToGamer();
        }
    }

    private void helpToGamer() {
        char buff[] = secretWord.toCharArray();

        for (int i = 0; i < words[wordNumber].length(); i++) {
            if (i > (words[randomisedNumber].length() - 1))
                break;

            if (words[wordNumber].charAt(i) == words[randomisedNumber].charAt(i))
                buff[i] = words[wordNumber].charAt(i);
        }
        secretWord = secretWord.valueOf(buff);

        System.out.println("Letters you got =");
        System.out.println(secretWord);

        gameStart();
    }
}
