import java.util.ArrayList;
import java.util.Scanner;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", age: " + age + " years.";
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ArrayList<Person2> persons= new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        String line = null;
        while(!(line = reader.nextLine()).isEmpty()){
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            persons.add(new Person2(name,age));
        }

        System.out.println("Number of people: " + persons.size());
        for(Person2 person: persons){
            System.out.println(person);
        }

        System.out.println("People above 20 years are: ");
        for(Person2 person: persons){
            if(person.getAge() >= 20){
                System.out.println(person);
            }
        }
    }
}
