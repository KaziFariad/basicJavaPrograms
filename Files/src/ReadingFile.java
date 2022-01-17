import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
    	
    	Scanner reader = new Scanner(System.in);
    	System.out.println("Enter filename:");
    	String filename = reader.nextLine();
    	ArrayList<String> lines = new ArrayList<>();
    	
    	
        try (Scanner fileScanner  = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                lines.add(line);
            }
            System.out.println(
            		"Number of lines are: " + 
            		lines.size());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + e.getLocalizedMessage());
        }
        
        
        reader.close();
    }
}
