public class SmallestMultiple {
  public static void main(String[] args) {
    long lcm = 1;
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    for (int i = arr.length / 2; i > 1; i--) {
      for (int j = i - 1; j < arr.length; j++) {
        if (arr[j] % i == 0) {
          arr[j] /= i;
        }
      }
      lcm *= i;
    }
    for (int i : arr) {
      lcm *= i;
      System.out.println(i);
    }
    System.out.println(lcm);
  }
}
