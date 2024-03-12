import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
    void readFile() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("d:/abc.txt");

    }

    void saveFile() throws FileNotFoundException{
        String txt = "Demo Version";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
    }
}

public class Main {
    public static void main(String[] args) {
        ReadAndWrite rd = new ReadAndWrite();
        try {
            rd.readFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}