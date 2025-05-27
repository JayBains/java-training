package Comparators;// Override the compareTo method so that it returns a postive
// number if the current Person is older than the passed other
// and a negative number if they are younger. If their age is the
// same then return the compareTo result on the names.

public class Main {
    public static void main(String[] args) {

        Person alice = new Person("Alice", 25);
        Person bob = new Person("Bob", 30);

        System.out.println("Alice compared to Bob: " + alice.compareTo(bob));
        System.out.println("Bob compared to Alice: " + bob.compareTo(alice));

    }
}