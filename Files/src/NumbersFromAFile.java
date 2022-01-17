import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the filename: ");
		String filename = reader.nextLine();
		System.out.print("Lower bound? ");
		int lowerBound = Integer.valueOf(reader.nextLine());
		System.out.print("Upper bound? ");
		int upperBound = Integer.valueOf(reader.nextLine());
		
		try(Scanner fileReader = new Scanner(Paths.get(filename))){
		
			int count = 0;
			while(fileReader.hasNextLine()) {
				int tempNum = Integer.valueOf(fileReader.nextLine());
				if(tempNum >= lowerBound && tempNum <= upperBound) {
					count++;
				}
			}
			System.out.println("Numbers: " + count);
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		reader.close();
	}
}
