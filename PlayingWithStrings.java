import java.util.Scanner;

public class PlayingWithStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = in.nextLine();
        String[] words = text.split(" ");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }

}
