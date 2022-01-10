import java.util.Scanner;

public class Collatz {
  public static int collatz(int number) {
    int result = 0;
    if (number % 2 == 0) {
      result = number / 2;
    } else {
      result = number * 3 + 1;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    System.out.println(number);
    while (number != 1) {
      number = collatz(number);
      System.out.println(number);
    }
    in.close();
  }
}