import java.nio.file.Paths;
import java.util.Scanner;

public class SkippingEmptyLine {
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(Paths.get("file.txt"))){
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if(line.isEmpty()) {
					continue;
				}
				
				System.out.println(line);
			}
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}