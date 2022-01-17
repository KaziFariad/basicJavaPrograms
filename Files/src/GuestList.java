import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestList {

	public static void main(String[] args) {
		
		ArrayList<String> guests = new ArrayList<>();
		
		try(Scanner fileReader = new Scanner(Paths.get("guestList.txt"))){
			while(fileReader.hasNextLine()) {
				guests.add(fileReader.nextLine());
			}
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		if(guests.size()!=0) {
			System.out.println("Enter guest's names, enter enter to stop:");
			Scanner reader = new Scanner(System.in);
			String guest = null;
			while(!((guest = reader.nextLine()).isEmpty())) {
				if(guests.contains(guest)) {
					System.out.println("The name is on the list");
				}
				else {
					System.out.println("The name is not on the list");
				}
			}
			reader.close();
		}
		
		
	}

}
