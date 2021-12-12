import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgram {

    private int duration;
    private String show;

    public TelevisionProgram(int duration, String show) {
        this.duration = duration;
        this.show = show;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "TelevisionProgram{" +
                "duration=" + duration +
                ", show='" + show + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<TelevisionProgram> shows = new ArrayList<>();
        String line = null;
        System.out.println("Enter shows and their duration separated by comma, press enter to stop:");
        while(!(line = reader.nextLine()).isEmpty()){
            String[] parts = line.split(",");
            String show = parts[0];
            int duration = Integer.parseInt(parts[1]);
            shows.add(new TelevisionProgram(duration, show));
        }
        System.out.println("Total shows: " + shows.size());

        for(TelevisionProgram show: shows) {
            System.out.println(show);
        }

        System.out.println("Enter the maximum duration: ");
        int max_duration = Integer.parseInt(reader.nextLine());

        for(TelevisionProgram show: shows){
            if(show.getDuration() <= max_duration ){
                System.out.println(show);
            }
        }
    }
}
