
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        ArrayList<Game> games = readFromFile(file);
        
        int matches = 0;
        int wins = 0;
        int loses = 0;
        
        for (Game game : games) {
            if (game.getHome().equals(team) || game.getOpp().equals(team)) {
                matches++;
                if (game.winner(team)) {
                    wins++;
                    continue;
                }
                loses++;
            }
        }
        System.out.println("Games: " + matches);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);
    } // end of main
    public static ArrayList<Game> readFromFile(String file) {
        ArrayList<Game> data = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String oppTeam = parts[1];
                int home = Integer.valueOf(parts[2]);
                int opp = Integer.valueOf(parts[3]);
                
                data.add(new Game(homeTeam, oppTeam, home, opp));
            } // end of while
        } catch (Exception e) {
            System.out.println("Could not find file.");
        } // end of try catch
        return data;
    } // end of ArrayList
} // end of class
