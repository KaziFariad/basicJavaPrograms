import java.util.Scanner;

public class SplittingStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        int maxAge = 1, currentAge;
        String oldestPerson = "";
        while(!line.equals("")){
            String[] nameAndAge = line.split(",");
            currentAge = Integer.valueOf(nameAndAge[nameAndAge.length-1]);
            System.out.println("Name:"+nameAndAge[0]+", Age:"+nameAndAge[1]);
            if(maxAge < currentAge){
                maxAge = currentAge;
                oldestPerson = nameAndAge[0];
            }
            line = reader.nextLine();
        }
        System.out.println("Max age:"+ maxAge+ " is of "+oldestPerson);
    }
}
