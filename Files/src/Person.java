import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the filename");
        people = StoringRecords.readRecordsFromFile(scanner.nextLine());
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("Total number of people are: " + people.size());
    }

    public String toString() {
        return "The name is " + this.name + " and age is " + this.age + " years";
    }
}
