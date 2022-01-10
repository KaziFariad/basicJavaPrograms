import java.util.ArrayList;

public class Prime {
  // 10,001st prime is 104,743.
  public static boolean isPrime(long n) {
    if (n < 2)
      return false;
    if (n == 2 || n == 3)
      return true;
    if (n % 2 == 0 || n % 3 == 0)
      return false;
    long sqrtN = (long) Math.sqrt(n) + 1;
    for (long i = 6L; i <= sqrtN; i += 6) {
      if (n % (i - 1) == 0 || n % (i + 1) == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    long timeStart = System.currentTimeMillis();
    long i = 2;
    ArrayList<Long> primes = new ArrayList<Long>();
    while (primes.size() < 10001) {

      if (isPrime(i)) {
        primes.add(i);
      }
      i++;

    }
    System.out.println(primes.get(primes.size() - 1));
    System.out.println(String.format("Time Taken: %sms", System.currentTimeMillis() - timeStart));
  }
}
