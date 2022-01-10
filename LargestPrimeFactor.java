
// Program to find the Largest Prime Factor of a number:
// import java.util.ArrayList;
import java.util.Scanner;

public class LargestPrimeFactor {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner in = new Scanner(System.in);
    long num = in.nextLong();
    long n = num;
    int result = 1;
    // ArrayList<Integer> arr = new ArrayList<Integer>();

    while (n % 2 == 0) {
      // arr.add(0, 2);
      result = 2;
      n /= 2;
    }

    for (int i = 3; i <= n; i += 2) {
      while (n % i == 0) {
        // arr.add(0, i);
        result = i;
        n /= i;
      }
    }
    // System.out.println(arr);
    // System.out.print("The Largest Prime Factor of " + num + " is: " +
    // arr.get(0));
    System.out.println(result);
    in.close();
  }
}