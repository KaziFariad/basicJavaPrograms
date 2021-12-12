//public class MainProgram {
//    public static void main(String[] args) {
//
//        Debt mortgage = new Debt(120000.0, 15.20);
//        mortgage.printBalance();
//
//        mortgage.waitOneYear();
//        mortgage.printBalance();
//
//        int years = 0;
//
//        while (years < 20) {
//            mortgage.waitOneYear();
//            years = years + 1;
//        }
//
//        mortgage.printBalance();
//    }
//}

public class MainProgram {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}