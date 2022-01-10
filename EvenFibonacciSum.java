public class EvenFibonacciSum {
  public static void main(String[] args) {
    int f = 1, s = 2, temp;
    long sum = 0;
    while (f < 4000000) {
      if (s % 2 == 0) {
        sum += s;
      }
      temp = s;
      s = f + s;
      f = temp;
    }
    System.out.println(sum);
  }
}
