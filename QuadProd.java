import java.util.Scanner;

public class QuadProd {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter count of values you are going to insert:");
    int N = in.nextInt();
    
    if (N < 4) {
      System.out.println("Invalid Input");
      return;
    }
    float temp = 1, max = 1;
    float nums[] = new float[N];
    System.out.println("Enter the " + N + " numbers:");
    for (int i = 0; i < N; i++) {
      nums[i] = in.nextFloat();
    }
    for (int p = 0; p < N - 3; p++) {
      for (int q = p + 1; q < N - 2; q++) {
        for (int r = q + 1; r < N - 1; r++) {
          for (int s = r + 1; s < N; s++) {
            temp = nums[p] * nums[q] * nums[r] * nums[s];
            System.out.println(temp + ": " + p + " " + q + " " + r + " " + s);
            if (temp > max) {
              max = temp;
            }
          }
        }
      }
    }
    in.close();
    System.out.println(max);
  }
}
