import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingStatFile {
    public static ArrayList<String> readData(String filename) {
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(filename))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lines;
    }
}
