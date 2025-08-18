// write   in  a file (LOVEU.txt).
import java.io.FileWriter;
import java.io.IOException;

public class file_handling2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("LOVEU.txt");
            fileWriter.write("this is our first file this file java course\n Okey now bye");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
