public class OddNumber {
    private int num;

    public OddNumber() {}

    public void test(int a) throws IllegalArgumentException {
        try {
            if (a % 2 != 0) {
                throw new IllegalArgumentException();
            }
            System.out.println("Success");
        } catch (IllegalArgumentException e) {
            System.out.println("Odd number.");
        }
    }
}