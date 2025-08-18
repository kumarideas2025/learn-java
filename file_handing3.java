
// reading a file.
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class file_handing3 {
    public static void main(String[] args) {
        File myfile = new File("LOVEU.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (

        FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
