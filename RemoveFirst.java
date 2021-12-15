import java.util.ArrayList;

public class RemoveFirst {
    public static void removeFirst(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return;
        }

        numbers.remove(0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);

        System.out.println(numbers);

        removeFirst(numbers);

        System.out.println(numbers);

        removeFirst(numbers);
        removeFirst(numbers);
        removeFirst(numbers);

        System.out.println(numbers);
    }
}
