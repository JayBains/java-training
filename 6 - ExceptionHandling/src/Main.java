public class Main {
    public static void main(String[] args) {
        try {
            test(6);
            System.out.println("Success");
        } catch (IllegalArgumentException e){
            System.out.println("Odd number.");
        }

        try {
            test(9);
            System.out.println("Success");
        } catch (IllegalArgumentException e){
            System.out.println("Odd number.");
        }
    }

    public static void test(int a) throws IllegalArgumentException{
        if (a % 2 != 0){
            throw new IllegalArgumentException();
        }
    }
}


