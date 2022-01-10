import java.util.Scanner;

public class Diffsquares {
  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int s = 0;
    int ss = 0;
    System.out.print("Enter a number: ");
    int num = in.nextInt();
    for (int i = 1; i <= num; i++) {
      s += i;
      ss += i * i;
    }
    s *= s;
    System.out.println(s - ss);
    in.close();
  }

}