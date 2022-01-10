public class LCM {
  public static void main(String[] args) {
    long lcm = 1;
    int[] a = new int[10];
    int n = a.length;
    for (int i = 0; i < n; i++) {
      a[i] = i + 1;
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[j] >= a[i] && a[j] % a[i] == 0) {
          a[j] /= a[i];
        }
      }
      lcm *= a[i];
    }
    System.out.println(lcm);
  }
}