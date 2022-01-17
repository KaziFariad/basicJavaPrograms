public class Clock {

    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;

    public Clock() {
        hours = new ClockHand(24);
        minutes = new ClockHand(60);
        seconds = new ClockHand(60);
    }

    public static void main(String[] args) {

        Clock clock = new Clock();
        while (true) {
            System.out.println(clock);
            clock.advance();
        }
    }

    public void advance() {
        seconds.advance();

        if (seconds.getValue() == 0) {
            minutes.advance();
            if (minutes.getValue() == 0) {
                hours.advance();
            }
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}