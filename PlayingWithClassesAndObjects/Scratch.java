public class Scratch {
    private int num;

    public void addAndPrint(int number){
        this.num += number;
        printNum();
    }

    public void printNum(){
        System.out.println(this.num);
    }

    public static void main(String[] args) {
        Scratch s = new Scratch();
        s.num = 2;
        s.printNum();
        s.addAndPrint(3);
    }
}
