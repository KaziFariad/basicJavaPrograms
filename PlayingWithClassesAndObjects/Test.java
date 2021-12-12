public class Test {
    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int sage(int age){
        return age + 2;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//class Main{
//
//    public static void main(String[] args) {
//        Test test = new Test("Me", 2);
//        System.out.println(test);
//        test.setAge(4);
//        System.out.println(test);
//        System.out.println(Test.sage(2));
//    }
//}
