public class Agent {

    private String firstName;
    private String lastName;

    public Agent(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public String toString(){
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        Agent ionic = new Agent("Ionic", "Bond");

        System.out.println(bond);
        System.out.println(ionic);

        bond.toString(); // prints nothing
    }
}
