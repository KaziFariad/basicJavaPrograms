import java.nio.file.Paths;
//import java.util.ArrayList;
import java.util.Scanner;

public class FindInFiles {
	public static void main(String[] args) {
		System.out.print("Enter filename: ");
		Scanner reader = new Scanner(System.in);
		String filename = reader.nextLine();
		System.out.print("Enter keyword to search: ");
		String keyword = reader.nextLine();
		
		try(Scanner fileReader = new Scanner(Paths.get(filename))){
//			ArrayList<String> lines = new ArrayList<>();
			boolean found = false;
			while(fileReader.hasNextLine() && !found) {
//				lines.add(fileReader.nextLine());
				String[] parts = fileReader.nextLine().split(" ");
				for(String word: parts) {
					if(word.contains(keyword)) {
						found = true;
						break;
					}
				}		
			}
			
//			boolean found = false;
//			for(String word:lines) {
//				if(word.contains(keyword)) {
//					found = true;
//					break;
//				}
//			}
			
			if(found) {
				System.out.println("Found");
			}
			else {
				System.out.println("Not found");
			}
		}
		catch(Exception e) {
			System.out.println("Reading the file " + filename + " failed!");
			System.out.println("Error: " + e.getMessage());
		}
		
		reader.close();
	}
}
