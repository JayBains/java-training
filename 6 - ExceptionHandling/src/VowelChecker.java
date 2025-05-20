import java.util.Scanner;

public class VowelChecker {
    String vowels = "aeiou";

    public void testVowelChecker(Scanner scanner){
        System.out.println("Please enter a string: ");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(Character.toString(input.toLowerCase().charAt(i)))) {
                System.err.println("Error: " + input.charAt(i) + " is a vowel");
                return;
            }
        }
    }
}
