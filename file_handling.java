//create a file.
import java.io.File;
import java.io.IOException;

public class file_handling {
    public static void main(String[] args) {
        // with this we can create a new file.
        File myfile = new File("LOVEU.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create this file");
            e.printStackTrace();
        }

    }
}