import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListReader {
    List<Integer> list = new ArrayList<>();
    int newNum;
    boolean duplicate = false;

    public void readList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some numbers in each line. Enter -1 to stop");

        while (!duplicate){
            newNum = scanner.nextInt();

            if (newNum == -1){
                System.out.println(list);
                duplicate = true;
            }

            if(list.contains(newNum)){
                System.err.println("Error: duplicate number found");
            } else {
                list.add(newNum);
            }
        }
    }
}
