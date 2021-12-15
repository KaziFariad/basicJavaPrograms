import java.util.ArrayList;

public class ArrayListTrial {
    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("Zero");
        numbers.add("One");
        numbers.add("Two");
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));

        System.out.println(numbers);
        numbers.remove("Two");
        System.out.println(numbers);

    }
}
