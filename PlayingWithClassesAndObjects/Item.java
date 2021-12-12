import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    private String name;

    public Item(String itemName){
        this.name = itemName;
    }

    public String toString(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
        return this.name + " (created at: " + format.format(LocalDateTime.now()) + ")";
    }

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        while(true){
            String itemName = reader.nextLine();
            if(itemName.equals("")){
                break;
            }
            else{
                items.add(new Item(itemName));
            }
        }
        for(Item i: items){
            System.out.println(i);
        }
    }
}
