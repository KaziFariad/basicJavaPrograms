import java.util.Scanner;

public class MagicSquare {
  public static void main(String[] args) {
    int a = 1;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter any odd number: ");
    int size = in.nextInt();
    int matrix[][] = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrix[i][j] = 0;
      }
    }
    int i = size / 2, j = size - 1;
    int tempi = i, tempj = j;
    matrix[i][j] = a;
    for (int c = 0; c < size * size - 1; c++) {
      a++;
      i--;
      j++;
      if (i < 0) {
        i = size - 1;
      }
      if (j > size - 1) {
        j = 0;
      }
      // System.out.print("i: " + i + ", j: " + j + ", tempi: " + tempi + ", tempj: "
      // + tempj + "\n");
      if (matrix[i][j] == 0) {
        matrix[i][j] = a;
        tempi = i;
        tempj = j;
      } else {
        matrix[tempi][tempj - 1] = a;
        i = tempi;
        j = tempj - 1;
      }
    }
    for (i = 0; i < size; i++) {
      for (j = 0; j < size; j++) {
        System.out.print(" " + matrix[i][j]);
      }
      System.out.println();
    }
  }
}
