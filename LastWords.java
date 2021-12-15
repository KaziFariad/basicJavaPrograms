import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String sentence = reader.nextLine();
        String words[] = sentence.split(" ");
        System.out.println(words[words.length-1]);
    }
}
