import java.util.Scanner;

public class LettersPlay {
  public static void main(String[] args) {
    int shiftValue = 2;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String foo = in.nextLine();
    in.close();
    String bar = "";

    for (char c : foo.toCharArray()) {
      bar += Character.toString((char) (((c - 'a' + shiftValue) % 26) + 'a'));
    }

    System.out.println(bar);
  }
}