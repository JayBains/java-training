package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelChecker {
    private final List<Character> vowelArr = new ArrayList<>();
    private final List<Character> consonantArr = new ArrayList<>();
    private final List<Character> outlierArr = new ArrayList<>();

    public void testVowelChecker(Scanner scanner) {
        if (scanner == null) {
            throw new IllegalArgumentException("Scanner cannot be null.");
        }

        System.out.println("Please enter a string: ");
        String input = scanner.nextLine().trim();

        for (char c : input.toCharArray()) {
            String s = Character.toString(c);
            String vowels = "aeiouAEIOU";
            String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
            if (vowels.contains(s)) {
                vowelArr.add(c);
            } else if (consonants.contains(s)) {
                consonantArr.add(c);
            } else {
                outlierArr.add(c);
            }
        }

        System.out.println("Vowels: " + vowelArr);
        System.out.println("Consonants: " + consonantArr);
        System.out.println("Outliers: " + outlierArr);
    }
}