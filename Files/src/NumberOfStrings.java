import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;

//        while(true){
//            String lineRead = reader.nextLine();
//            if(lineRead.equals("end")){
//                System.out.println(count);
//                break;
//            }
//            else{
//                count++;
//            }
//        }

        while (true) {
            String row = reader.nextLine();

            if (row.equals("end")) {
                break;
            }

            int number = Integer.valueOf(row);
            System.out.println(number * number * number);
        }
    }
}
