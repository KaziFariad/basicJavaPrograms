import java.util.ArrayList;
import java.util.Scanner;

public class SportsStatistics {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = reader.nextLine();
        ArrayList<String> lines = ReadingStatFile.readData(filename);
        if (lines.isEmpty()) {
            return;
        }
        System.out.print("Enter team name: ");
        String team = reader.nextLine();
        int games = 0, wins = 0, losses = 0;
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts[0].equals(team) || parts[1].equals(team)) {
                games++;
                if ((parts[0].equals(team) && Integer.parseInt(parts[2]) > Integer.parseInt(parts[3]))
                        || (parts[1].equals(team) && Integer.parseInt(parts[3]) > Integer.parseInt(parts[2])
                )) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
