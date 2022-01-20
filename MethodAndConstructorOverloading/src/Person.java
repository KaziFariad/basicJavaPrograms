public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        height = 0;
        weight = 0;
    }

    public void printPerson(){
        System.out.println(name + " is " + age + " years old");
    }

    public void growOlder(){
//        this.growOlder(1);
        growOlder(1);
    }

    public void growOlder(int years){
        age += years;
    }

    public boolean isAdult(){
        return age>18;
    }

    public double bodyMassIndex(){
        double heightInMeters = height / 100.0;
        return weight/(heightInMeters * heightInMeters);
    }

    public String toString(){
        return name + " is " + age + " years old" ;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person paul = new Person("Paul", 24);
        System.out.println(paul);

        paul.growOlder();
        System.out.println(paul);

        paul.growOlder(10);
        System.out.println(paul);
    }
}
