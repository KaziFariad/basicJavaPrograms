public class Counter {
    private int value;

    public Counter(int startValue){
        value = startValue;
    }

    public Counter(){
        this(0);
    }

    public int value(){
        return value;
    }

    public void increase(){
        value++;
    }

    public void decrease(){
        value--;
    }

    public void increase(int increaseBy){
        if(increaseBy > 0){
        value += increaseBy;
        }
    }

    public void decrease(int decreaseBy){
        if(decreaseBy > 0){
            value -= decreaseBy;
        }
    }

    public String toString(){
        return "Counter's value is: " + value;
    }

    public static void main(String[] args) {
        Counter counter0 = new Counter();
        Counter counter1 = new Counter(100);
        counter0.increase();
        System.out.println(counter0);
        counter0.increase(2);
        System.out.println(counter0.value());
        System.out.println(counter1);
        counter1.decrease(-2);
        System.out.println(counter1);
    }

}

