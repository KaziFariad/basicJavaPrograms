public class LargestPalindromeProduct {
  public static void main(String[] args) {
    for (int i = 999; i > 99; i--) {
      for (int j = i; j > 99; j--) {
        String numAsString = "" + (i * j);
        if (isLargest(numAsString)) {
          System.out.println(numAsString);
          return;
        }
      }
    }
  }

  private static boolean isLargest(String number) {
    int len = number.length();
    char[] firstHalf = number.substring(0, len / 2).toCharArray();
    char[] secondHalf = number.substring(len - len / 2).toCharArray();
    for (int a = 0; a < len / 2; a++) {
      if ((firstHalf[a]) != secondHalf[len / 2 - a - 1]) {
        return false;
      }
    }
    return true;
  }
}
