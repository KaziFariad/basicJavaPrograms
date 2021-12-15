public class Printing {

    public static void main(String[] args) {

        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        System.out.println("    *");
        System.out.println();
        for (int j = 1; j < 5; j++) {
            for(int i = 4; i > 0; i--) {
                System.out.print(" ");
            System.out.print("*");
            }
        }
    }
}
