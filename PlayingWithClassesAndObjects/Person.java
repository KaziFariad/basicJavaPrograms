//public class Person {
//
//    private String name;
//    private int age;
//
//    public Person(String name){
//        this.name = name;
//        this.age = 0;
//    }
//
//    public void growOlder(){
//        this.age += 1;
//    }
//
////    public void printPerson(){
////        System.out.println("Person name: " + this.name + ", age: " + this.age);
////    }
//
//    public boolean isOfLegalAge(){
//        return this.age >= 18;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public String toString(){
//        return this.name + ", age " + this.age + " years";
//    }
//
//    public static void main(String[] args) {
//        Person pekka = new Person("Pekka");
//        Person antti = new Person("Antti");
//
//        int i = 0;
//        while (i < 30) {
//            pekka.growOlder();
//            i = i + 1;
//        }
//
//        antti.growOlder();
//
//        System.out.println("");
//
//        if (antti.isOfLegalAge()) {
//            System.out.println(antti.getName() + " is of legal age");
//        } else {
//            System.out.println(antti.getName() + " is underage");
//
//        }
//
//        if (pekka.isOfLegalAge()) {
//            System.out.println(pekka.getName() + " is of legal age");
//
//        } else {
//            System.out.println(pekka.getName() + " is underage");
//
//        }
//        System.out.println(pekka);
////        System.out.println(pekka.toString());
//    }
//
//}

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public void printName(){
        System.out.println("Name: " + this.name + " has BMI: "+ this.bodyMassIndex());
    }

    public String toString(){
//        return this.name + ", age " + this.age + " years, my body mass index is " + this.bodyMassIndex();
//        same as:
        return this.name + ", age " + this.age + " years, my body mass index is " + bodyMassIndex();
    }

    public static void main(String[] args) {
//        Person person = new Person("Name");
//        person.setHeight(170);
//        person.setWeight(70);
//        System.out.println(person);
//        person.printName();

//        ArrayList<Person> persons = new ArrayList<>();
//        Person john = new Person("John");
//        persons.add(john);
//        persons.add(new Person("Matthew"));
//        persons.add(new Person("Martin"));
//
//        for(Person person:persons){
//            System.out.println(person);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

// Read the names of persons from the user
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }


            // Add to the list a new person
            // whose name is the previous user input
            persons.add(new Person(name));
        }

// Print the number of the entered persons, and their individual information
        System.out.println();
        System.out.println("Persons in total: " + persons.size());
        System.out.println("Persons: ");

        for (Person person: persons) {
            System.out.println(person);
        }
        }
    }