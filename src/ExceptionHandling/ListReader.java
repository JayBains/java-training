package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListReader {
    List<Integer> list = new ArrayList<>();
    int newNum;
    boolean duplicate = false;

    public void readList(Scanner scanner) {
        System.out.println("Please input some numbers in each line. Enter -1 to stop.");

        try {
            while (!duplicate) {
                newNum = scanner.nextInt();
                if (newNum == -1) {
                    System.out.println(list);
                    duplicate = true;
                }
                if (list.contains(newNum)) {
                    System.err.println("Error: " + newNum + " is a duplicate number.\n" + list);
                    duplicate = true;
                }
                list.add(newNum);
            }
        } catch (IllegalArgumentException e){
            System.err.println(list);
        }
    }
}
