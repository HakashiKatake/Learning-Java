import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        String filePath = "/Users/saurabhyadav/Desktop/Learning new shit/Learning Java/25-FileHandling/test.txt";
       
        try( BufferedReader reader = new BufferedReader(new FileReader(filePath));) {
            
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("could not locate file");
        }
        catch (IOException e) {
            System.out.println("something went wrong");
        }
    }
}
