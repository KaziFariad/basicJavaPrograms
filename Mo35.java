import java.util.Scanner;

public class Mo35 {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    long sum = 0;
    for (int i = 1; i <= number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
    in.close();
  }
}