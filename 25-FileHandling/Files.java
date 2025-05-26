import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Files {
    public static void main(String[] args) {

        String filePath = "/Users/saurabhyadav/Desktop/Learning new shit/Learning Java/25-FileHandling/test.txt";
        String content = "Yooooo";
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("File has been written");
        } catch(FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }
        catch(IOException e) {
            System.out.println("Could not write file");
        }

    }
}
