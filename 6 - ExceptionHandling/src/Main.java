import java.io.File;

public class Main {
    public static void main(String[] args){

        OddNumber oddNumber = new OddNumber();
        oddNumber.test(1);
        oddNumber.test(2);

        FileReader newFileReader = new FileReader();
        newFileReader.testFileReader(new File("C:\\TestFiles\\test.txt"));

        ListReader newListReader = new ListReader();
        newListReader.readList();

    }
}


