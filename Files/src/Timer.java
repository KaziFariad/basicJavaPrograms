public class Timer {


    private ClockHand hundredthsOfASecond;
    private ClockHand seconds;

    public Timer() {
        hundredthsOfASecond = new ClockHand(100);
        seconds = new ClockHand(60);
    }

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }

    public void advance() {
        hundredthsOfASecond.advance();
        if (hundredthsOfASecond.getValue() == 0) {
            if (seconds.getValue() == 0) {
                seconds.advance();
            }
            seconds.advance();
        }
    }

    public String toString() {
        return "" + seconds + ":" + hundredthsOfASecond;
    }
}
