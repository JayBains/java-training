package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    boolean isEmpty = true;

    public void testFileReader(File myFile) {
        try(Scanner scanner = new Scanner(myFile)){
            while (scanner.hasNextLine()){
                isEmpty = false;
                System.out.println(scanner.nextLine());
            }
            if (isEmpty){
                System.err.println("Error: this file is empty.");
            }
        } catch (FileNotFoundException e){
            System.err.println("Error: File not found.");
        }
    }
}
