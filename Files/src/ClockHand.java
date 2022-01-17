public class ClockHand {

    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public static void main(String[] args) {
        ClockHand seconds = new ClockHand(60);
        ClockHand minutes = new ClockHand(60);
        ClockHand hours = new ClockHand(24);

        while (true) {

            System.out.println(hours + " : " + minutes + " : " + seconds);

            seconds.advance();

            if (seconds.getValue() == 0) {
                minutes.advance();
                if (minutes.getValue() == 0) {
                    hours.advance();
                }
            }

        }


    }

    public void advance() {
        this.value++;
        if (value >= limit) {
            this.value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        if (value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
}