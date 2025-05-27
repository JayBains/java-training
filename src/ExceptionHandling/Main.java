package ExceptionHandling;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Which program would you like to run? \n1) Odd number checker\n2) Vowel checker\n3) List reader\n4) File reader\n5) Exit");
                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            IsPrimeNumber oddNumber = new IsPrimeNumber();
                            oddNumber.test(scanner);
                            break;
                        case 2:
                            VowelChecker vowelChecker = new VowelChecker();
                            vowelChecker.testVowelChecker(scanner);
                            break;
                        case 3:
                            ListReader listReader = new ListReader();
                            listReader.readList(scanner);
                            break;
                        case 4:
                            FileReader fileReader = new FileReader();
                            fileReader.testFileReader(new File("C:\\TestFiles\\Slayer's Testament.txt"));
                            break;
                        case 5:
                            System.out.println("Exiting program...");
                            return;
                        default:
                            System.out.println("Please enter a number between 1 and 5:");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a number between 1 and 5.");
                    scanner.nextLine();
                }
            }
        }
    }
}