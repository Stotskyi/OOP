import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    private File file;
    private int numberCount;
    private int minValue;
    private int maxValue;
    
    public Write(File f, String[] args) {
        file = f;
        numberCount = Integer.parseInt(args[1]);
        minValue = Integer.parseInt(args[2]);
        maxValue = Integer.parseInt(args[3]);
    }
    
    public  void WriteToFile(){
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < numberCount; i++) {
                int randomNumber = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
                writer.write(String.valueOf(randomNumber));
                writer.write(System.lineSeparator());
            }
            System.out.println("Numbers successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
