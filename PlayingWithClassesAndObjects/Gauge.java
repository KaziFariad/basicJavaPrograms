public class Gauge {

    private int value;

    public Gauge(){
        this.value = 0;
    }

    public void increase(){
        this.value += 1;
    }

    public void decrease(){
        if(this.value > 0){
            this.value -= 1;
        }
    }

    public int getValue(){
        return this.value;
    }

    public boolean isFull(){
        return this.value >= 5;
    }

    public static void main(String[] args) {
        Gauge g = new Gauge();

        while(!g.isFull()) {
            System.out.println("Not full! Value: " + g.getValue());
            g.increase();
        }

        System.out.println("Full! Value: " + g.getValue());
        g.decrease();
        System.out.println("Not full! Value: " + g.getValue());
    }
}
