import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        christmasTree(in.nextInt());
    }

    public static void christmasTree(int height){
        for(int i = 1; i <= height; i++){
            printSpaces(height - i);
            printStars(i);
            printStars(i-1);
            System.out.println();
        }
        for(int i = 0; i < 2; i++){
            printSpaces(height - 2);
            printStars(3);
            System.out.println();
        }
    }

    public static void printSpaces(int number){
        for(int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size){
        for(int i = 1; i <= size; i++){
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height){
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSquare(int number){
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStars(int number){
        for(int i = 0; i < number;i++){
            System.out.print("*");
        }
    }
}