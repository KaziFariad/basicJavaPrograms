import java.util.ArrayList;

public class RemoveLast {
    public static void removeLast(ArrayList<Integer> list){
        if(list.size() == 0){
            return;
        }
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(9);
        System.out.println(list);
        removeLast(list);
        System.out.println(list);
        removeLast(list);
        removeLast(list);
        System.out.println(list);
    }
}
