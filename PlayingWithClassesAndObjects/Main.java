//public class Main {
//    public static void main(String[] args) {
//        Whistle duckWhistle = new Whistle("Kvaak");
//        Whistle roosterWhistle = new Whistle("Peef");
//
//        duckWhistle.sound();
//        roosterWhistle.sound();
//        duckWhistle.sound();
//
//        Door alexander = new Door();
//
//        alexander.knock();
//        alexander.knock();
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int evenSum = 0, oddSum = 0;
//        Statistics statistics = new Statistics();
//        System.out.println("Enter numbers:");
//        while(true){
//            int num = Integer.valueOf(scanner.nextLine());
//            if(num == -1){
//                break;
//            }
//            statistics.addNumber(num);
//            if(num%2 == 0){
//                evenSum += num;
//            }
//            else{
//                oddSum += num;
//            }
//        }
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
//        System.out.println("Sum of evens: " + evenSum);
//        System.out.println("Sum of odds: " + oddSum);
//    }
//}

public class Main {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}