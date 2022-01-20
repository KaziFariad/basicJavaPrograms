public class Example {
    public static void main(String[] args) {

        Person first = new Person("First");

        System.out.println(first);
        youthen(first);
        System.out.println(first);

        Person second = first;
        youthen(second);

        System.out.println(first);

        int a[] = {1,2,4,5};
        int b[];
        b = a;
        b[2] = 3;
        a[3] = 4;
        System.out.println(a[2] + " " + b[2]);
        System.out.println(a[3] + " " + b[3]);
    }

    public static void youthen(Person person) {
        person.setBirthYear(person.getBirthYear() + 1);
    }

}
