import java.util.Scanner;

public class IsPrimeNumber {

    public void test(Scanner scanner) {
        System.out.println("Please enter a number to test for prime number:");

        try {
            int input = scanner.nextInt();
            if (input <= 1) {
                throw new IllegalArgumentException();
            }
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    throw new IllegalArgumentException();
                }
            }
            System.err.println("Prime number.");
        } catch (IllegalArgumentException e) {
            System.err.println("Not a prime number.");
        }
    }
}