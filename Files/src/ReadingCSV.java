import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingCSV {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = reader.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                if (age > 1) {
                    System.out.println(name + ", age: " + age + " years");
                } else if (age == 1) {
                    System.out.println(name + ", age: 1 year");
                } else {
                    System.out.println("Age cannot be negative");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
