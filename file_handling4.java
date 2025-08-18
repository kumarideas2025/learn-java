// deleting a file.

import java.io.File;

public class file_handling4 {
    public static void main(String[] args) {
                File myfile = new File("LOVEU.txt");
                     if(myfile.delete()){
                        System.out.println(" i have delted "+myfile.getName());
                     }
                     else{
                        System.out.println("some error occurred while in the file");
                     }
    }
}
// after run this ...will del the LOVEU file.