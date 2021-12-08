import java.util.Scanner;

public class SumOfPrimes {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number: ");
    long n = in.nextLong();
    long sum = 0;
    for (long i = 2; i < n; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }
    System.out.println(sum);
    in.close();
  }

  private static boolean isPrime(long i) {
    if (i == 2 || i == 3) {
      return true;
    }
    if (i % 2 == 0 || i % 3 == 0) {
      return false;
    }
    long len = (long) Math.sqrt(i);
    for (long a = 6L; a < len; a += 6) {
      if ((i % a - 1 == 0) || (i % a + 1 == 0)) {
        return false;
      }
    }
    return true;
  }
}
