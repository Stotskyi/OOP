import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    private File file;
    
    
    public Read(File f) {
        file = f;
    }

    public  void ReadFromFile(){
        try (FileReader reader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

}
