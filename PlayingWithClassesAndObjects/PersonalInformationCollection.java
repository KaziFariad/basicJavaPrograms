import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    private String firstName;
    private String lastName;
    private int id;

    public PersonalInformationCollection(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        ArrayList<PersonalInformationCollection> pic = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("Enter first name:");
            String firstName = reader.nextLine();
            if(firstName.isEmpty()){
                break;
            }
            System.out.println("Enter last name:");
            String lastName = reader.nextLine();

            System.out.println("Enter id:");
            int id = Integer.parseInt(reader.nextLine());
            pic.add(new PersonalInformationCollection(firstName, lastName));
        }

        System.out.println("Number of entries: " + pic.size());
        for(PersonalInformationCollection p : pic){
            System.out.println(p);
        }
    }
}
