public class OddNumber {

    public void test(int a) throws IllegalArgumentException {
        try {
            if (a % 2 != 0) {
                throw new IllegalArgumentException();
            }
            System.err.println("Success");
        } catch (IllegalArgumentException e) {
            System.err.println("Odd number.");
        }
    }

}